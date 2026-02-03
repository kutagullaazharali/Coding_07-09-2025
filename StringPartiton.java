import java.util.*;

class StringPartition {
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        int last[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            if (i == end) {
                list.add(end - start + 1);
                start = i + 1;
            }
        }
        System.out.println(Arrays.toString(last));
        System.out.println(list);
    }
}
