public class Pairs {
    public static void main(String[] args) {
        int n[] = { 1, 2, 3, 4, 5, 6 };
        int target = 7;
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                if (n[i] + n[j] == target) {
                    System.out.println(n[i]+"  :  "+n[j] + " == "+target);
                }
            }
        }
    }
}
