import java.util.*;

class AllCombination {
    public static void getPer(StringBuilder curr, int n, ArrayList<String> res) {
        if (curr.length() == n) {
            res.add(curr.toString());
            return;
        }
        curr.append('0');
        getPer(curr, n, res);
        curr.deleteCharAt(curr.length() - 1);
        curr.append('1');
        getPer(curr, n, res);
        curr.deleteCharAt(curr.length() - 1);
    }

    public static void main(String[] args) {
        int num[] = { 1, 2 };
        int number = 2;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        getPer(sb, number, list);
        System.out.println(list);
        String str[] = { "00", "01" };
        Set<String> set = new HashSet<>();
        for (String s : str) {
            set.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            if (!set.contains(list.get(i))) {
                System.out.println(list.get(i));
            }
        }
    }
}