import java.util.HashSet;
import java.util.Set;

class Sample6 {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for (int k = 0; k < matrix.length; k++) {
            for (int m = 0; m < matrix[0].length; m++) {
                if (row.contains(k) || col.contains(m)) {
                    {
                        matrix[k][m] = 0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Sample6 s = new Sample6();
        int n[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        // System.out.println(Arrays.toString(n));
         for (int i = 0; i < n.length; i++) {
             for (int j = 0; j < n.length; j++) {
                 System.out.print(n[i][j]);
             }
            System.out.println();
        }
       s.setZeroes(n);
       System.out.println();
        
       for (int i = 0; i < n.length; i++) {
           for (int j = 0; j < n.length; j++) {
               System.out.print(n[i][j]);
           }
            System.out.println();
        }
    }
}