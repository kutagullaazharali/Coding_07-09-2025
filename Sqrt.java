public class Sqrt {
    public static int SquareRootMethod(int num) {
        if (num < 2) {
            return num;
        }
        int ans = 0;
        int left = 1;
        int right = num / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == num / mid) {
                return mid;
            } else if (mid < num / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 8;
        int res = SquareRootMethod(n);
        System.out.println("final output : " + res);
    }
}
