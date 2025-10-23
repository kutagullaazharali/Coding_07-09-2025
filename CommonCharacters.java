
import java.util.*;

class CommonCharacters {
   
    public static void main(String[] args) {
        String s[] = { "bella", "label", "roller" };
        
        char ch[] = s[0].toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : ch) {
            stack.add(c);
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            char arr[] = s[i].toCharArray();
            int count = 0;
            char val = 'k';
            for (char cc : arr) {
                if (stack.contains(cc)) {
                    count++;
                    
                }
            }
            if (count == s.length - 1) {
                 set.add(cc);
            }
        }

        System.out.println("final output : "+stack);
    }
}