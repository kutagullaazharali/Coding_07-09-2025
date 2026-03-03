import java.util.ArrayList;
import java.util.List;

public class AllPermutations {
    public static void getpermutations(int[] arr, ArrayList<List<Integer>> results, List<Integer> dummy,
            boolean[] boo) {
        if (dummy.size() == arr.length) {
            results.add(new ArrayList<>(dummy));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (boo[i]) {
                continue;
            }
            boo[i] = true;
            dummy.add(arr[i]);
            getpermutations(arr, results, dummy, boo);
            dummy.remove(dummy.size() - 1);
            boo[i] = false;
        }
    }

    public static ArrayList<List<Integer>> getPermutations(int[] arr) {
        ArrayList<List<Integer>> results = new ArrayList<>();
        boolean[] bool = new boolean[arr.length];
        getpermutations(arr, results, new ArrayList<>(), bool);
        return results;
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3 };
        ArrayList<List<Integer>> output = getPermutations(n);
        System.out.println(output);
    }
}