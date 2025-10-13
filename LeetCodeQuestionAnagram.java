import java.lang.reflect.Array;
import java.util.*;

class LeetCodeQuestionAnagram {
    public static List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            char[] a = words[i].toCharArray(), b = list.get(list.size()-1).toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if (!Arrays.equals(a, b)) {
                list.add(words[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr = { "abba", "baba", "bbaa", "cd", "cd" };
        System.out.println(removeAnagrams(arr));
    }
}