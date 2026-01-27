public class ReverseString2 {
    static public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length()-k; i+=k) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);

            sb.setCharAt(i+1, c1);
            sb.setCharAt(i, c2);
        }
    return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s,k));
    }
}
