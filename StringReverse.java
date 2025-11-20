public class StringReverse {
    public static String reverseMethod(String s) {

        if (s == "" || s.isEmpty()) {
            return "";
        }
        String rev = "";
        int i = 0;
        while (i < s.length() - 1) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            String temp = "";
            while (i < s.length() && s.charAt(i) != ' ') {
                temp += s.charAt(i);
                i++;
            }
            if (!temp.equals("")) {
                rev = temp + " " + rev;
            }

        }
        if (rev.isEmpty()) {
            return "";
        }
        return rev.substring(0, rev.length() - 1);

    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        String res = reverseMethod(s);
        System.out.println("final output : " + res);
    }
}
