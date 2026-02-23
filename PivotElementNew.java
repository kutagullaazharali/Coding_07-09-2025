public class PivotElementNew {
    public static void main(String[] args) {
        int num[] = { 1, 2, 4, 5, 6, 1 };
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        System.out.println(sum);
        int leftSum = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            if (leftSum == sum - leftSum - num[i]) {
                System.out.println(num[i]);
            }
            leftSum += num[i];
        }
        System.out.println(leftSum);
        System.out.println(sum);
    }
}
