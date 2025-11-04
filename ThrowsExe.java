public class ThrowsExe {
    public static void m1() throws Exception{
        System.out.println("m1 method");
        m2();

    }

    public static void m2() throws Exception{
    System.out.println("m2 method");
        m3();
    }

    public static void m3() throws Exception  {
        // System.err.println(1/0);
        System.out.println("m3 method");

    }

    public static void main(String[] args) throws Exception{
        System.out.println("main method");
        try{
            m1();
            m1();
        }
        catch (Exception e) {

        }
        finally{
        }
    }
}
