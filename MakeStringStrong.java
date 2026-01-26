import java.util.Stack;
public class MakeStringStrong {
    public static void main(String[] args) {
        String s = "leEetcode";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && (s.charAt(i) - stack.peek()) == 32) {
                stack.pop();
                System.out.println("pop");
            } 
            stack.push(s.charAt(i));
        }
        System.out.println(stack);
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        String res = sb.reverse().toString();
        System.out.println("final output : " + res);
    }
}
