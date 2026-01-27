public class StringConcat {
    public static String addStrings(String num1, String num2) {
        long n1 = 0;
        long n2 = 0;
       for(int i = 0; i < num1.length(); i++) {
           n1 = n1 * 10 + Integer.parseInt(num1.charAt(i) + "");
             System.out.println("keep track : " + n1);
       }
       for(int i = 0; i < num2.length(); i++) {
            n2 = n2 * 10 + Integer.parseInt(num2.charAt(i)+"");
       }
       System.out.println(n1);
       System.out.println(n2);
        long res = n1 + n2;
    return res+"";
    }

    public static void main(String[] args) {
        String num1 = "6913259244", num2 = "71103343";
        System.out.println(addStrings(num1, num2)); // Output: "134"
    }
}

