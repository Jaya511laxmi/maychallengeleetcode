class Solution {
    public int longestPalindrome(String[] words) {
        int[][]mat=new int[26][26];
        int answer=0;
         for(int i=0;i<words.length;i++){
            int n1=words[i].charAt(0)-97;
            int n2=words[i].charAt(1)-97;
            if(mat[n2][n1]>=1){
                mat[n2][n1]--;
                answer+=4;
            }else{
                mat[n1][n2]++;
            }
         }
         for(int i=0;i<26;i++){
            if(mat[i][i]>=1){
                return answer+2;
            }
         }
         return answer;
    }
}
