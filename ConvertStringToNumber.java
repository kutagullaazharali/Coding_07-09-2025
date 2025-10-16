public class ConvertStringToNumber {
    public static void main(String[] args) {
        String s = "-1234";
        char flag = '+';
        int i = 0;
        if (s.charAt(i) == flag) {
            i++;
        }
        else if (s.charAt(i) == '-') {
            flag = '-';
            i++;
        }
        int results = 0;
        while (i < s.length()) {
            int last = s.charAt(i) - '0';
            results = results * 10 + last;
            i++;
        }
        if (s.charAt(0) == '-') {
            results = -results;
        }
        System.out.println("final results : "+results);
    }
}
