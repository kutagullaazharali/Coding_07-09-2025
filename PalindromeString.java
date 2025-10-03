public class PalindromeString {

    public boolean CheckPalindrome(String s){
        String original = s;
        String rev = "";
        for(int i=s.length()-1;i>=0; i--) {
            rev += s.charAt(i);
        }
        return rev.equals(original);
    }
    public static void main(String []args) {
        String s = "malayalam";
        PalindromeString obj = new PalindromeString();
        System.out.println("final output " +obj.CheckPalindrome(s));
    }
}
