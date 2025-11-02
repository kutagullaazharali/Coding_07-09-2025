class LeetCodeQuestionUnguard {
    private static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int results = 0;
        int gird[][] = new int[m][n];
        for (int g[] : guards) {
            gird[g[0]][g[1]] = 1;
        }
        for (int w[] : walls) {
            gird[w[0]][w[1]] = 2;
        }
        int dirs[][] = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        for (int[] g : guards) {
            for (int d[] : dirs) {
                int r = g[0] + d[0];
                int c = g[1] + d[1];
                while (r >= 0 && c >= 0 && r < m && c < n && gird[r][c] != 1 && gird[r][c] != 2) {
                    if (gird[r][c] == 0) {
                        gird[r][c] = 3;
                    }
                    r += d[0];
                    c += d[1];
                }
            }
        }
        
        for (int i = 0; i < gird.length; i++) {
            for (int j = 0; j < gird[0].length; j++) {
                if (gird[i][j] == 0) {
                    results++;
                }
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int m = 4, n = 6;
        int[][] guards = { { 0, 0 }, { 1, 1 }, { 2, 3 } };
        int[][] walls = { { 0, 1 }, { 2, 2 }, { 1, 4 } };
        System.out.println(countUnguarded(m, n, guards, walls)); // Output: 7
    }
}