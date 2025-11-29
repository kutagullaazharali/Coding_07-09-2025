
class ReverseString {
    public static String revmethod(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String finalrev = "";
        for (int i = 0; i < s.length(); i++) {
            String temp = "";
            while (i < s.length() && s.charAt(i) != ' ') {
                temp += s.charAt(i);
                i++;
            }
            finalrev += revmethod(temp);
            if (i < s.length() && s.charAt(i) == ' ') {
                finalrev += ' ';
            }
        }
        System.out.println("Original String :" + s);
        System.out.println("final String :" + finalrev);
    }
}