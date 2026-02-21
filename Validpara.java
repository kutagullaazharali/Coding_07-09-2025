import java.util.*;
import java.util.Stack;

public class Validpara {
    static public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                if (c == '(') {
                    stack.push(')');
                } else if (c == '[') {
                    stack.push(']');
                } else if (c == '{') {
                    stack.push('}');
                }
            } else {
                if (!stack.isEmpty() && c == stack.peek()) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        System.out.println(stack);
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = ")(){}";
        System.out.println(isValid(s));
    }
}
