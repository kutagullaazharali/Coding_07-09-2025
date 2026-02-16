public class BinaryNumberlearn {

    static public String addBinary(String a, String b) {
        int value1 = 0;
        int value2 = 0;
        int index = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            char c = a.charAt(i);
            int power = (int) Math.pow(2, index++);
            value1 += (int) power * (int) (c - '0');
        }
        System.out.println("Value 1 : " + value1);
        index = 0;
        for (int i = b.length() - 1; i >= 0; i--) {
            char c = b.charAt(i);
            int power = (int) Math.pow(2, index++);
            value2 += (int) power * (int) (c - '0');
        }
        System.out.println("Value 2 : " + value2);
        value1 = value1 + value2;
        String output = "";
        while (value1 > 0) {
            int remainder = value1 % 2;
            output = remainder + output;
            value1 /= 2;
        }
        if (output.isEmpty()) {
            return "0";
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("0", "0"));
        System.out.println("--------------Start------------");
        String a = "11";
        String b = "1";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        String results = "";
        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = 0;
            int digitB = 0;
            if (i >= 0) {
                digitA = a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                digitB = b.charAt(j) - '0';
                j--;
            }
            int sum = digitA + digitB + carry;
            System.out.println(sum);
            int resDigit = sum % 2;
            carry = sum / 2;
            results = resDigit + results;
        }
        System.out.println( "final output  :  "+results);
        System.out.println("--------------end------------");

        System.out.println("--------------------------");
        int num = 11;
        int num1 = 1;
        String binary = Integer.toBinaryString(num);
        String binary1 = Integer.toBinaryString(num1);
        // System.out.println(binary);
        // System.out.println(binary1);

        int n1 = 10;
        String b1 = "";
        // System.out.println("Start");
        while (n1 > 0) {
            int remainder = n1 % 2;
            // System.out.println("running");
            b1 = remainder + b1;
            n1 = n1 / 2;
        }
        // System.out.println(b1);
        // System.out.println("end");

        String binarynum = "10";
        int index = 0;
        int value = 0;
        /*
         * for (int i = binarynum.length() - 1; i >= 0; i--) {
         * char c = binarynum.charAt(i);
         * int power = (int) Math.pow(2, index++);
         * value += (int) power * (int) (c - '0');
         * }
         */
        // System.out.println(value);
    }
}
