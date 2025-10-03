public class NumberIntoWords {
    public static void main(String[] args) {
        int n = 123;
        String str = String.valueOf(n);
String[] words = {"zero", "one", "two", "three", "four", 
                          "five", "six", "seven", "eight", "nine"};
        for(int i = 0;i<str.length(); i++) {
            char c = str.charAt(i);
            int number = c-'0';
            System.out.println(words[number]);
        }
    }
}
