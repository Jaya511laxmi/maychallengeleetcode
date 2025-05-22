class Solution {
    public int maxRemoval(int[] nums, int[][] queries) {
        // Sort queries by starting index
        Arrays.sort(queries, (a, b) -> Integer.compare(a[0], b[0]));

        int totalUsedQueries = 0;
        int queryIndex = 0;
        int[] effect = new int[nums.length + 1]; // Difference array to track decrements
        int currentDecrement = 0;

        // Max-heap to store the end indices of active queries
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            currentDecrement += effect[i];

            if (currentDecrement < nums[i]) {
                // Push all queries that start at or before index i
                while (queryIndex < queries.length && queries[queryIndex][0] <= i) {
                    if (queries[queryIndex][1] >= i) {
                        maxHeap.add(queries[queryIndex][1]);
                    }
                    queryIndex++;
                }

                // Use queries from the heap until nums[i] can be zeroed
                while (currentDecrement < nums[i]) {
                    if (maxHeap.isEmpty() || maxHeap.peek() < i) {
                        return -1; // Not enough range to decrement this position
                    }
                    int endIndex = maxHeap.poll();
                    currentDecrement++;
                    effect[endIndex + 1]--; // Mark where the decrement effect ends
                    totalUsedQueries++;
                }
            }
        }

        return queries.length - totalUsedQueries; // Maximum queries that can be removed
    }
}
