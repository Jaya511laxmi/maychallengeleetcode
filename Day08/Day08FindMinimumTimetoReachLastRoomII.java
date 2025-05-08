class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int[][] vis = new int[moveTime.length][moveTime[0].length];
        for(int[] a : vis){
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        vis[0][0] = 0;

        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[0]-b[0]);

        q.add(new int[]{0,0,0,2});// dist,i,j,prevSec

        int[] r = new int[]{-1,0,1,0};
        int[] c = new int[]{0,-1,0,1};
        while(!q.isEmpty()){
            int[] curr = q.remove();
            int cTime = curr[0];
            int cI = curr[1];
            int cJ = curr[2];
            int cSec = curr[3];

            for(int i = 0 ; i < 4 ; i++){
                int nI = cI+r[i];
                int nJ = cJ+c[i];
                int nSec = 0;
                if(cSec == 2){
                    nSec = 1;
                }else{
                    nSec = 2;
                }

                if(nI >= 0 && nJ >= 0 && nI < moveTime.length && nJ < moveTime[0].length){
                    if(moveTime[nI][nJ] > vis[cI][cJ]){
                        int nTime = moveTime[nI][nJ] + nSec;
                        if(nTime < vis[nI][nJ]){
                            vis[nI][nJ] = nTime;
                            q.add(new int[]{nTime,nI,nJ,nSec});
                        }
                    }else{
                        int nTime = vis[cI][cJ] + nSec;
                        if(nTime < vis[nI][nJ]){
                            vis[nI][nJ] = nTime;
                            q.add(new int[]{nTime,nI,nJ,nSec});
                        }
                    }
                }
            }
        }
        return vis[moveTime.length-1][moveTime[0].length-1];
    }
}
