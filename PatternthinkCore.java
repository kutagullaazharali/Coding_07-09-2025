public class PatternthinkCore {
    public static void main(String[] args) {
        String s = "world";
        int sp = s.length() * 2 - 3;
        for (int i = 0; i <=s.length()-1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s.charAt(j)+" ");
            }
            for (int k = 1; k <= sp; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                if (j == i && i == s.length() - 1) {
                    continue;
                }
                System.out.print(s.charAt(j)+" ");
            }
            sp -= 2;
            System.out.println();
        }
    }
}
