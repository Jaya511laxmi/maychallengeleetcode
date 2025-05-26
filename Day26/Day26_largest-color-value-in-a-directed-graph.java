
class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[n];
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            inDegree[edge[1]]++;
        }

        int[][] dp = new int[n][26];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) queue.offer(i);
            dp[i][colors.charAt(i) - 'a'] = 1;
        }

        int seen = 0, max = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            seen++;
            for (int nei : graph.get(curr)) {
                for (int c = 0; c < 26; c++) {
                    int colorCount = dp[curr][c] + (colors.charAt(nei) - 'a' == c ? 1 : 0);
                    dp[nei][c] = Math.max(dp[nei][c], colorCount);
                }
                inDegree[nei]--;
                if (inDegree[nei] == 0) queue.offer(nei);
            }
            for (int c = 0; c < 26; c++) {
                max = Math.max(max, dp[curr][c]);
            }
        }

        return seen == n ? max : -1;  // if we didn't visit all nodes, there's a cycle
    }
}
vbnet
Copy
Edit
