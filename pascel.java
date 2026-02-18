
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

class pascel {
    public static void main(String[] args) {
        int num = 5;
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    if (i >= 1) {
                        List<Integer> tempList = output.get(i-1);
                        int n1 = tempList.get(j-1);
                        int n2 = tempList.get(j);
                        list.add(n1 + n2);
                    }
                }
            }
            output.add(list);
        }
    System.out.println(output);
    }
}