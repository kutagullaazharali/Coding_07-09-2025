import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public static List<List<Integer>> getPascalTriangle(int row) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> fstrow = new ArrayList<>();
        fstrow.add(1);
        triangle.add(fstrow);
        for (int i = 1; i < row; i++) {
            List<Integer> prev = triangle.get(i - 1);
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(prev.get(j - 1) + prev.get(j));
            }
            temp.add(1);
            triangle.add(temp);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int rows = 5;
        List<List<Integer>> output = getPascalTriangle(rows);
        for (List<Integer> entry : output) {
            System.out.println(entry);
        }
    }
}