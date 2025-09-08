

class PalindromeNumber {
    public static boolean isPalindrome(int x)
    {
        String str = String.valueOf(x);
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) !=  str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums = 121;
        boolean res = isPalindrome(nums);
        System.out.println("Final Output : " + res);

    }
}
 