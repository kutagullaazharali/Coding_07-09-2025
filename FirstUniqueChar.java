public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println("First unique character: " + firstUniqChar(s));
    }

    public static char firstUniqChar(String s) {
        int[] freq = new int[26];
        
        for (int i = 0; i <= s.length()-1; i++) {   // BUG 1 is here
            char c = s.charAt(i);
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i);
            }
        }
        return '_'; // if no unique char
    }
}
