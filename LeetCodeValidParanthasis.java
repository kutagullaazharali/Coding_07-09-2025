public class LeetCodeValidParanthasis {
    public static boolean checkValid(String s) {
        s = s.replaceAll("[^a-zA-z0-9]", "").toLowerCase();
        int left = 0;
        int rigth = s.length() - 1;
        while (left < rigth) {
            if (s.charAt(left) != s.charAt(rigth)) {
                return false;
            }
            left++;
            rigth--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean output = checkValid(s);
        System.out.println("final output : "+output);
    }
}
