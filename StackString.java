import java.util.Stack;

public class StackString {
    public static void main(String[] args) {
        StackString obj = new StackString();
        String s = "leetcode";
        String res = obj.makeGood(s);
        System.out.println("final output : " + res);
    }

    public String makeGood(String s) {
        Stack<Character> stack =  new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty() && (stack.peek() - s.charAt(i)) == 32 ) {
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
    return sb.reverse().toString();
    }




}

