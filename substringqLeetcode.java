import java.util.ArrayList;

class substringqLeetcode {
    public static String getreverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static boolean isSubstringPresent(String s) {
        System.out.println("original string : "+s);
        String revStr = getreverseString(s);
        System.out.println("reverse string : "+revStr);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < s.length() - 2; i++) {
            String str = s.substring(i, i + 2);
            list.add(str);
        }
        for (int i = 0; i < revStr.length() - 2; i++) {
            String temp = s.substring(i, i + 2);
            if (list.contains(temp)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "leetcode";
       System.out.println(isSubstringPresent(s));
    }
}