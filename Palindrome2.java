public class Palindrome2 {
    public static boolean isPalindrome(String s,int l, int r) {
        int left = l;
        int right = r;
        while(left < right) {
            if(s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(checkMethod(s));
    }
    public static boolean checkMethod(String s) {
      
        int left = 0;
        int rigth = s.length()-1;
        while(left < rigth) {
            if(s.charAt(left) != s.charAt(rigth)) {
                return isPalindrome(s,left+1,rigth) || isPalindrome(s,left,rigth-1);
            }
            left++;
            rigth--;
        }
        return true;
    }
}
