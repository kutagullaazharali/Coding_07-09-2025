
import java.util.ArrayList;

public class StringOperation1LeetCode {

    public boolean hasSameDigits(String s) {
        while (s.length() > 2) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int i = 0; i < s.length() - 1; i++) {
                int n1 = s.charAt(i)-'0';
                int n2 = s.charAt(i+1)-'0';
                int res = (n1 +n2) % 10;
                al.add(res);
            }
            StringBuilder temp = new StringBuilder();
            for (int x : al) {
                temp.append(x);
            }
            s = temp.toString();
        }
        return s.charAt(0)==s.charAt(1);
    }

    public static void main(String[] args) {
        StringOperation1LeetCode obj = new StringOperation1LeetCode();
        String str1 = "3902";
        System.out.println(obj.hasSameDigits(str1));
    }
}
