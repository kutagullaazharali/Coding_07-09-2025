public class IntegertoBinary {
    public static void main(String[] args) {
        int num = 43261596;
        System.out.println("input   ::   " + num);

        StringBuilder sb = new StringBuilder();
        String binary = Integer.toBinaryString(num);
        StringBuilder str = new StringBuilder(binary).reverse();

        System.out.println("running   ::   " + str);

        // System.out.println("Start");
        while (num > 0) {
            int remainder = num % 2;
            sb.append(remainder);
            num = num / 2;
        }
        System.out.println(sb);

        int index = 0;
        int value1 = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            int power = (int) Math.pow(2, index++);
            value1 += (int) power * (int) (c - '0');
        }
        System.out.println(value1);
        System.out.println("final end");
    }
}
