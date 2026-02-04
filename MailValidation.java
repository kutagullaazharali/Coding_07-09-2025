
import java.util.ArrayList;
import java.util.Arrays;

public class MailValidation {
   static public int numUniqueEmails(String[] emails) {
       int count = 0;
       ArrayList<String> arr = new ArrayList<>();
       for (String s : emails) {

           s = s.replace(".", "");
           if (s.contains("+")) {

               int indexplus = s.indexOf("+");
               int indexat = s.indexOf("@");
               
           }
           
           //System.out.println(Arrays.toString(str));
           StringBuilder sb = new StringBuilder();
           for (int i = 0; i < str.length; i++) {

           }
           arr.add(sb.toString());
        }
        return count;
    }
    public static void main(String[] args) {
        String s[] = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com" };
        int output = numUniqueEmails(s);
        System.out.println(output);
    }
}
