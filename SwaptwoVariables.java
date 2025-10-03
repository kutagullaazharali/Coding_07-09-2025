public class SwaptwoVariables {
    public static void main(String[] args) {
        int var1 = 9;
        int var2 = 10;

        System.out.println("var 1 org : "+var1);
        System.out.println("var 2 org : "+var2);
        
        var1 = var1+var2;
        var2 = var1 - var2;
        var1 = var1 - var2;
        System.out.println("var 1 : "+var1);
        System.out.println("var 2 : "+var2);

        int v1 = 1;
        int v2 = 2;
        System.out.println("v1 org : "+v1);
        System.out.println("v2 org : "+v2);
        int temp = v1;
        v1 = v2;
        v2 = temp;
        System.out.println("v1  : "+v1);
        System.out.println("v2  : "+v2);
    }
}
