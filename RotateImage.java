class RotateImage {
    public static void rotate(int[][] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n[0].length; j++) {
                int temp = n[j][i];
                n[j][i] = n[i][j];
                n[i][j] = temp;
            }
        }



         for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length/2; j++) {
                int temp = n[i][j];
                n[i][j] = n[i][n.length-1-j];
                n[i][n.length-1-j] = temp;
            }
        }
    }
    public static void main(String[] args) {
         int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
         };
         for (int i = 0; i < matrix.length; i++) { // Iterate through rows
            for (int j = 0; j < matrix[i].length; j++) { // Iterate through columns of the current row
                System.out.print(matrix[i][j] + " "); // Print element and a space
            }
            System.out.println(); // Move to the next line after printing a row
        }
        rotate(matrix);

        System.out.println();

        for (int i = 0; i < matrix.length; i++) { // Iterate through rows
            for (int j = 0; j < matrix[i].length; j++) { // Iterate through columns of the current row
                System.out.print(matrix[i][j] + " "); // Print element and a space
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}