
import java.util.Stack;

public class ValidParathasis {
    public static void main(String[] args) {
        String s = "([{}])";
        ValidParathasis obj = new ValidParathasis();
        boolean results = obj.ValidParathasisMethod(s);
        System.out.println("Final Output : " + results);
    }

    public boolean ValidParathasisMethod(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
