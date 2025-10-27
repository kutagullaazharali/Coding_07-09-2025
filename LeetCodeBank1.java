public class LeetCodeBank1 {
    public static int numberOfBeams(String[] str) {
        int ans = 0;
        int prev = 0;
        int n = str[0].length();
        for (String s : str) {
            int dev = 0;
            for (int j = 0; j < n; j++) {
                dev += s.charAt(j) == '1' ? 1 : 0;
            }
            if(dev>0) {
                ans += prev * dev;
                prev = dev;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str[] = { "011001", "000000", "010100", "001000" };
        System.out.println("final output : "+numberOfBeams(str));
    }
}
