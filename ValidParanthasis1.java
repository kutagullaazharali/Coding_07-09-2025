import java.util.HashMap;
import java.util.*;

class ValidParathasis1 {
    public static boolean CheckValidParanthasis(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.keySet().contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            }
            else if (map.values().contains(s.charAt(i))) {
                char curr = s.charAt(i);
                if (!stack.isEmpty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                }
            }
            else {
                return false;
            }
        }
        return stack.empty();
    }
    public static void main(String[] args) {
        String s = "([])";
        System.out.println(CheckValidParanthasis(s));

    }
}