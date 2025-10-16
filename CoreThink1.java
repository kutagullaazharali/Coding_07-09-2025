public class CoreThink1 {
    public static void main(String[] args) {
        int n[] = { 5, 4, 3, 6, 7, 1, 2 };
        int target = 17;
        int start = 0;
        int end = 0;
        for (int i = 0; i <= n.length - 1; i++) {
            int currentSum = n[i];
            for (int j = i+1; j <= n.length - 1; j++) {
                currentSum = currentSum + n[j];
                if (currentSum == target) {
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println(start);
        System.out.println(end);
    }
}
