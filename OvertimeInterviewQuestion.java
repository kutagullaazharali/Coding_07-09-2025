public class OvertimeInterviewQuestion {
    public static double getOt(double nums[]) {
        double start = nums[0];
        double end = nums[1];
        double rate = nums[2];
        double multiper = nums[3];
        double normalhours = 0;
        double overtimehours = 0;

        if (end > 17) {
            overtimehours = end - Math.max(start, 17);
            normalhours = Math.min(end, 17) - start;
        } else {
            normalhours = end - start;
        }
        double normal = normalhours * rate;
        double ot = overtimehours * rate * multiper;

        return ot + normal;
    }

    public static void main(String[] args) {
        double[] input = { 16, 18, 30, 1.8 };
        double res = getOt(input);
        System.out.println("final output : " + res);
    }
}
