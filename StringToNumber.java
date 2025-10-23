public class StringToNumber {
    public static int stringToNumber(String s) {
        int results = 0;
        int i = 0;
        int sign = 1;
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){ 
            sign = (s.charAt(i)=='-')? -1:1;
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (results > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            results = results * 10 + digit;
            i++;
        }
        return results*sign;
    }
    public static void main(String[] args) {
        String s = "42";
        System.out.println(stringToNumber(s));
    }
}
