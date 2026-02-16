public class IntegertoBinarynew1 {
    public static void main(String[] args) {

        int num = 43261596;
        System.out.println("input   ::   " + num);

        // Convert to binary
        String binary = Integer.toBinaryString(num);

        // Make it 32 bits
        while (binary.length() < 32) {
            binary = "0" + binary;
        }

        // Reverse it
        StringBuilder str = new StringBuilder(binary).reverse();
        System.out.println("running   ::   " + str);

        int index = 0;
        int value1 = 0;

        // Convert reversed binary to decimal (YOUR LOGIC)
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            int power = (int) Math.pow(2, index++);

            value1 += power * (c - '0');
        }

        System.out.println(value1);
        System.out.println("final end");
    }
}