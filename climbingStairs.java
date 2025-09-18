public class climbingStairs {
    public static void main(String[] args) {
        int n = 3;
        if (n <= 2) {
            System.out.println("output : " + n);
        }
        int x = 1;
        int y = 2;
        for (int i = 2; i < n; i++) {
            int temp = x;
            x = y;
            y = temp + x;
        }
        System.out.println("final output : " + y);
    }
}
