class varargs {
    public static void TestMethod(String ...var) {
        for(String s : var) {
            System.out.println("String : "+s);
        }
    }
    public static void main(String args[]) {
        TestMethod("hello","hi");
    }
}