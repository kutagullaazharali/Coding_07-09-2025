public class MinimumNumberIncreament {
    public static int minNumberOperations(int[] target) {
        int results = target[0];
        for (int i = 1; i < target.length; i++) {
            if (target[i] > target[i - 1]) {
                results += target[i] - target[i - 1];
            }
        }
        return results;
    }
    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 2, 1 };
        System.out.println(minNumberOperations(n));
    }
}
