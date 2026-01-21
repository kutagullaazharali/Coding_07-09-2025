import java.util.Arrays;

public class Minimumfallingsumpath {
    public int minFallingPathSum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int sum = 0;
        int dp[][] = new int[row][col];
        for (int i = 0; i < col; i++) {
            dp[0][i] = matrix[0][i];
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                System.out.print(dp[i][j]);
            }
        }
        int topleft = Integer.MAX_VALUE;
        int topright = Integer.MAX_VALUE;
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (j - 1 >= 0) {
                    topleft = matrix[i - 1][j];
                }
                if (j + 1 < col) {
                    topright = matrix[i - 1][j];
                }
                dp[i][j] += matrix[i][j] + Math.min(matrix[i - 1][j], Math.min(topleft, topright));
            }
        }


        for (int i = 0; i < row; i++) {
            sum += dp[row - 1][i];
        }

        return sum;

    }

    public static void main(String[] args) {
        int[][] matrix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
        Minimumfallingsumpath obj = new Minimumfallingsumpath();

    }
}
