import java.util.*;

class ValidParathasis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();

                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParathasis solution = new ValidParathasis();

        // Test cases
        String[] tests = {
            "()",       // true
            "()[]{}",   // true
            "(]",       // false
            "([)]",     // false
            "{[]}",     // true
            "",         // true (empty string is valid)
            "(((",      // false
            ")))"       // false
        };

        for (String test : tests) {
            System.out.println("Input: \"" + test + "\" -> Output: " + solution.isValid(test));
        }
    }
}
