public class JumpGame {
    public static void main(String[] args) {
        int n[] = { 2, 3, 1, 1, 4 };
        int maxReach = n[0];
        int lastIndex = n.length - 1;
        boolean flag = false;
        for (int i = 1; maxReach >= i; i++) {
            if (maxReach >= lastIndex) {
                flag = true;   
            }else {
                maxReach = Math.max(maxReach, n[i] + i);
            }
        }
        if (flag) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
