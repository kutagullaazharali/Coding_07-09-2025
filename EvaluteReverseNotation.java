import java.util.*;
public class EvaluteReverseNotation {
    public static int evalRPN(String[] tokens) {
         Stack<String> s = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                int res = 0;
                int num2 = Integer.parseInt(s.pop());
                int num1 = Integer.parseInt(s.pop());
                if(token.equals("+"))
                {
                     res = num1 + num2;
                    
                }
               else if(token.equals("-"))
                {
                     res = num1 - num2;
                }
               else if(token.equals("/"))
                {
                     res = num1 / num2;
                }
              else if(token.equals("*"))
                {
                     res = num1 * num2;
                }
                
            s.push(Integer.toString(res));
            }
            else {
                s.push(token);
            }

        }
        return Integer.parseInt(s.peek());
    }

    public static boolean isOperator(String s) {
        if(s.equals("+") || s.equals("-") || s.equals("/")|| s.equals("*") ) {
            return true;
        }
        return false;
    }
    

    public static void main(String[] args) {
        
        String str[] = { "4","13","5","/","+" };
        int res = evalRPN(str);
        System.out.println("final output : "+res);
    }
}
