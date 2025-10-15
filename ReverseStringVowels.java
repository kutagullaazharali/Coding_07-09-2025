public class ReverseStringVowels {
    public static void Main(String args[]) {
        String s = "IceCreAm";
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int rigth = sb.length()-1;
        while(left < rigth) {
            if  ("aeiou".indexOf(sb.charAt(left)) != -1) {
                // left++;
                if ("aeiou".indexOf(sb.charAt(rigth)) != -1) {
                    sb.setCharAt(left, s.charAt(rigth));
                    sb.setCharAt(rigth, s.charAt(left));
                    rigth--;
                    left++;
                }
            }  
            else 
            {
                left++;
            }
        }
    }
}
