import java.util.HashMap;
import java.util.Map;

class FindFraction {
    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";

        StringBuilder result = new StringBuilder();

        // Handle negative sign
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        long n1 = Math.abs((long) numerator);
        long n2 = Math.abs((long) denominator);

        // Append integer part
        result.append(n1 / n2);

        long remainder = n1 % n2;
        if (remainder == 0) return result.toString();

        result.append(".");

        Map<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                int idx = map.get(remainder);
                result.insert(idx, "(");
                result.append(")");
                return result.toString();
            }
            map.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / n2);
            remainder %= n2;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int num = 4;
        int demonum = 333;
        String output = fractionToDecimal(num, demonum);
        System.out.println("final output : " + output);
    }
}
