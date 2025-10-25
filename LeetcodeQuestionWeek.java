public class LeetcodeQuestionWeek {
    public static int getMooney(int num) {
        int results = 0;
        int i = 1;
        int k = 1; 
        int count = 0;
        while (i <= num) {
            results += k + count;
            if (k == 7) {
                k = 1;
                count++;
            }
            else {
                k++;
            }
            i++;
        }
        return results;
    }
    public static void main(String[] args) {
        int n = 4;
        int output = getMooney(n);
        System.out.println("final output : "+output);
    }
}
