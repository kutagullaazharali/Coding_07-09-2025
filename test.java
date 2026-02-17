public class test {

    public static boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (sb.toString().equals(goal)) {
                return true;
            }
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            // sb.reverse();
             sb.append(c);
            System.out.println(sb);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }
}
