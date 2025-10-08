class ReturnCheck {
    public static int checkMethod(int a) {
        int ans = a;
        try {
            System.out.println("try executed successfully.....");
            return ans;
        } catch (Exception e) {
            System.out.println("nothing to print");
        }
        finally {
            System.out.println("finally executed successfully....");
            return 100;
        }
    }
    public static void main(String[] args) {
        int res = checkMethod(10);
        System.out.println(res + " final output");
    }
}