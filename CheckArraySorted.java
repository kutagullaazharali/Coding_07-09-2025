class CheckArraySorted {
    public static void main(String args[]) {
        int n[] = { 1, 2, 3, 4, 5, 6 };
        boolean flag=true;
        for (int i = 1; i < n.length; i++) {
            if (n[i] < n[i - 1]) {
                flag = false;
                break;
            }
        }
        System.out.println("final output : "+flag);
    }
}