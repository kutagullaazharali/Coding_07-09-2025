
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MailValidation {
    static public int numUniqueEmails(String[] emails) {
       int count = 0;
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            String str[] = s.split("@");
            str[0] = str[0].replace(".", "");
            str[0] += "@";
            s = String.join("", str);
            if (s.contains("+")) {
               int plus = s.indexOf("+");
                int at = s.indexOf('@');
                if(plus < at) {
                    String temp = s.substring(plus, at);
                    s = s.replace(temp, "");
                }              
            }
            set.add(s);
       }
    return set.size();
    }

    public static void main(String[] args) {
        String s[] = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com" };
        int output = numUniqueEmails(s);
        System.out.println(output);
    }
}
