public class LeetCodeMinTimeToRemoveBollens {
    public static int getTime(int num[], String bollens) {
        int sum = 0;
        int prevTime = num[0];
        for (int i = 1; i < bollens.length(); i++) {
            if (bollens.charAt(i) == bollens.charAt(i-1)) {
                sum += Math.min(prevTime, num[i]);
                prevTime = Math.max(prevTime, num[i]);
            } else {
                prevTime = num[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 1 };
        String s = "aabaa";
        int res = getTime(n, s);
        System.out.println("final output  :" + res);
    }
}
