class Solution {

    private static class Point {
        public final int x;
        public final int y;
        public final int time;
        public Point(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        Queue<Point> q = new PriorityQueue<>((p1, p2) -> p1.time - p2.time);
        boolean[][] visited = new boolean[n][m];
        int[][] directions = new int[][] {{-1,0},{1,0},{0,-1},{0,1}};
        q.add(new Point(0,0,0));
        while (!q.isEmpty()) {
            Point cur = q.poll();
            int curX = cur.x;
            int curY = cur.y;
            int curTime = cur.time;
            if (curX == n - 1 && curY == m - 1) return curTime;
            if (visited[curX][curY]) continue;
            visited[curX][curY] = true;
            for (int[] d: directions) {
                int newX = curX + d[0];
                int newY = curY + d[1];
                if (newX < 0 || newY < 0 || newX > n - 1 || newY > m - 1) continue;
                int newTime = Math.max(curTime, moveTime[newX][newY]);
                q.add(new Point(newX, newY, newTime + 1));
            }
        }
        return -1;
    }
}
