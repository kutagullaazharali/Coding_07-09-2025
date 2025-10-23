public class StockMarketLeetCode {
    public static int getProfit(int[] num) {
        int results = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            min = Math.min(min, num[i]);
            results = Math.max(results, num[i]-min);
        }
        return results;
    }
    public static void main(String[] args) {
        int num[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("final profit in the stock : "+ getProfit(num));
    }
}