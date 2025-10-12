public class PerfectsSquare {
    public static boolean checkPerfectSquare(int num) {
        int i = 0;
        while (i * i <= num) {
            if (i * i == num) {
                return true;
            }
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 49;
        System.out.println(checkPerfectSquare(n));
    }
}
