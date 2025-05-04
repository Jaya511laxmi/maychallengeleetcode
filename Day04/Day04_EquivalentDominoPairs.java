class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {

        int[] count = new int[100];
        int result = 0;
        for(int[] n: dominoes){
            int a =n[0];
            int b = n[1];
            int key=0;
            if(a>b){
                key =  b*10+a;
            }
            else{
                key = a*10+b;
            }
            result = result + count[key];
            count[key]++;
        }
        return result;
    }
}
