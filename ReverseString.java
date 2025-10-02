public class ReverseString {
    public static String ReverseMethod(String s) {
        String rev = "";
        for(int i = s.length()-1;i>=0;i--) {
            rev +=s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println("original String : "+s);
        String output = ReverseMethod(s);
        System.out.println("final output String : "+output);
    }
}
