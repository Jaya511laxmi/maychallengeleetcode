import java.util.*;

class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Arrays.sort(tasks);  // Sort tasks in increasing difficulty
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        // Count available workers by strength
        for (int w : workers)
            map.put(w, map.getOrDefault(w, 0) + 1);

        int res = 0, left = 0, right = Math.min(tasks.length, workers.length) - 1;

        // Binary search: try to assign mid + 1 tasks
        while (left <= right) {
            int mid = (left + right) / 2;

            if (validate(tasks, new TreeMap<>(map), pills, strength, mid)) {
                res = mid + 1;
                left = mid + 1;  // Try assigning more
            } else {
                right = mid - 1; // Try assigning fewer
            }
        }

        return res;
    }

    // Helper to validate if we can assign (pos + 1) hardest tasks
    boolean validate(int[] tasks, TreeMap<Integer, Integer> map, int pills, int strength, int pos) {
        for (; pos >= 0; pos--) {
            int task = tasks[pos];
            int maxWorker = map.lastKey();

            // If even the strongest worker + pill can't do the task
            if ((pills == 0 && maxWorker < task) || (pills > 0 && strength + maxWorker < task))
                return false;

            // If worker alone can't do it, use pill
            if (maxWorker < task) {
                task -= strength;
                pills--;
            }

            // Find the weakest worker who can still do this task
            Integer match = map.ceilingKey(task);
            if (match == null) return false;

            if (map.get(match) > 1)
                map.put(match, map.get(match) - 1);
            else
                map.remove(match);
        }
        return true;
    }
}
