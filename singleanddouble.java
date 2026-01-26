public class singleanddouble {
    public static void main(String[] args) {
        int num[] = { 1, 2, 34, 21, 90 };
        int singlenumber = 0;
        int doublenumber = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 9) {
                doublenumber += num[i];
            } else {
                singlenumber += num[i];
            }
        }
        boolean res = singlenumber != doublenumber ? true : false;
        System.out.println("Output : " + res);
    }
}
