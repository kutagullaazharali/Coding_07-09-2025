public class ReverseStringVowels1 {
    public static void Main(String args[]) {
        String s = "IceCreAm";
            StringBuilder sb = new StringBuilder(s);
            int left = 0;
            int rigth = sb.length() - 1;
            while (left < rigth) {
                if ("aeiou".indexOf(sb.charAt(left)) == -1) {
                    left++;
                } else if ("aeiou".indexOf(sb.charAt(rigth)) == -1) {
                    rigth++;
                } else {
                    sb.setCharAt(left, s.charAt(rigth));
                    sb.setCharAt(rigth, s.charAt(left));
                    rigth--;
                    left++;
                }
            }
        System.err.println("final output : "+sb);
    }
}
