// Last updated: 7/8/2026, 3:39:05 PM
class Solution {
    public void rotate(int[][] a) {

        int n = a.length;

        for (int i = 0; i < (n + 1) / 2; i++) {

            for (int j = 0; j < n / 2; j++) {

                int temp = a[n - 1 - j][i];

                a[n - 1 - j][i] = a[n - 1 - i][n - 1 - j];

                a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i];

                a[j][n - 1 - i] = a[i][j];

                a[i][j] = temp;
            }
        }
    }
}