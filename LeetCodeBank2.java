public class LeetCodeBank2 {
    public static int numberOfBeams(String[] str) {
        int  preCount= count(str[0]);
        int ans = 0;
        for (int j = 1; j < str.length; j++) {
            int currentCount = count(str[j]);
            if (currentCount == 0) {
                continue;
            }
            ans += currentCount * preCount;
            preCount = currentCount;
        }
        return ans;
    }
    
    public static int count(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='1') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str[] = { "011001", "000000", "010100", "001000" };
        System.out.println("final output : "+numberOfBeams(str));
    }
}
