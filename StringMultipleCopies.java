public class StringMultipleCopies {
    public static boolean getStatus(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (sb.toString().contains(s.charAt(i) + "")) {
                break;
            }
            sb.append(s.charAt(i));
        }

        int i = 0;
        int n = s.length();
        int k = sb.length();
        while (i < n - k) {
            String temp = s.substring(i, i + k);
            if (!temp.equals(sb.toString())) {
                return false;
            }
            i += k;
        }
        return i == n;
    }
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(getStatus(s));
    }
}