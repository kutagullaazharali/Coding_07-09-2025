public class CoreThink {
    public static void main(String[] args) {
        int n[][] = { { 1, 4, 3 }, { 7, 9, 1 }, { 5, 3, 4 } };
        int psum = 0;
        int ssum = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (i == j) {
                    psum += n[i][j];
                }
                if (i + j == n.length - 1) {
                    ssum += n[i][j];
                }
            }
        }
        int res = Math.abs(psum - ssum);
        System.out.println(res);
    }
}
