class Solution {
    public String pushDominoes(String A) {
        char[] dominoes = A.toCharArray();
        int n = dominoes.length;
        int[] force = new int[n];
        int f = 0;

        // Left to Right pass (R forces)
        for (int i = 0; i < n; i++) {
            if (dominoes[i] == 'R') {
                f = n;
            } else if (dominoes[i] == 'L') {
                f = 0;
            } else {
                f = Math.max(f - 1, 0);
            }
            force[i] += f;
        }

        // Right to Left pass (L forces)
        f = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (dominoes[i] == 'L') {
                f = n;
            } else if (dominoes[i] == 'R') {
                f = 0;
            } else {
                f = Math.max(f - 1, 0);
            }
            force[i] -= f;
        }

        // Build result
        StringBuilder result = new StringBuilder();
        for (int val : force) {
            if (val > 0) {
                result.append('R');
            } else if (val < 0) {
                result.append('L');
            } else {
                result.append('.');
            }
        }

        return result.toString();
    }
}
