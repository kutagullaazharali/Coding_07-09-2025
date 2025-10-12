public class MissingNumber {
    public static void main(String[] args) {
        int n[] = { 1, 2, 4, 5, 6 };
        int len = n.length;
        int finalRes = len * (len + 1) / 2;
        System.out.println("final length : " + finalRes);
        for (int i : n) {
            finalRes -= i;
        }
        System.out.println("final Result : "+finalRes);
    }
}
