import java.util.Arrays;

class VowelsReverse {
    static public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        System.out.println(Arrays.toString(ch));
        int i = 0;
        int first = 0;
        int last = s.length() - 1;
        String str = "aeiouAEIOU";
        while (first < last) {
            while (first < ch.length && !str.contains(ch[first] + "")) {
                first++;
            }
            while (last >= 0 && !str.contains(ch[last] + "")) {
                last--;
            }
            char temp = ch[first];
            ch[first] = ch[last];
            ch[last] = temp;
            first++;
            last--;
        }
        System.out.println(Arrays.toString(ch));
        String res = "";
        return res;
    }

    public static void main(String[] args) {
        String s = "IceCreAm"; // AceCreIm
        System.out.println(reverseVowels(s));
    }
}