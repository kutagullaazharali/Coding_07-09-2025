import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLists {
    public List<Integer> MergeMethod(List<Integer> list1, List<Integer> list2) {
        List<Integer> finalResults = new ArrayList<>();

        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {

            if (list1.get(i) < list2.get(j)) {
                finalResults.add(list1.get(i));
                i++;
            } else {
                finalResults.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            finalResults.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            finalResults.add(list2.get(j));
            j++;
        }

        return finalResults;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists obj = new MergeTwoSortedLists();
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);

        List<Integer> merged = obj.MergeMethod(l1, l2);
        System.out.println("Final Output : " + merged);

    }
}
