import java.util.Set;
import java.util.TreeSet;
import java.util.Stack;

public class Removecharacters {
    public static void main(String[] args) {
        String s = "bcabc";
        Stack<Character> stack = new Stack<>();
        System.out.println("=======start======");
        for (int i = 0; i < s.length(); i++) {
           // System.out.println(Character.valueOf(s.charAt(i)));
            if (stack.contains(Character.valueOf(s.charAt(i)))) {
                //stack.pop();
                stack.push(Character.valueOf(s.charAt(i)));
                
            } else {
                 stack.push(Character.valueOf(s.charAt(i)));
            }
            System.out.println(stack);
        }
        System.out.println("======stop=====");
        System.out.println(stack);

       StringBuilder sb = new StringBuilder();
       for (Character c : stack) {
            System.out.println(c +"  :  character");
            sb.append(c);
        }
        System.out.println(sb);
    }
}
