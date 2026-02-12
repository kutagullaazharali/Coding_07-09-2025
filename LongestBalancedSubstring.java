class LongestBalancedSubstring {
    public static boolean isBalance(int[] n) {
        int expect = 0;
        for (int i = 0; i < 25; i++) {
            if (n[i] > 0) {
                if (expect == 0) {
                    expect = n[i];
                } else if (n[i] != expect) {
                    return false;
                }
            }
        }
        return true;

    }

    public static int longestBalanced(String s) {
        int output = 0;
        for (int i = 0; i < s.length(); i++) {
            int freq[] = new int[26];
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(i);
                freq[c - 'a']++;
                if (isBalance(freq)) {
                    output = Math.max(output, j - i + 1);
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String s = "abbac";
        System.out.println(longestBalanced(s));
    }
}