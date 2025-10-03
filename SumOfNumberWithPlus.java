public class SumOfNumberWithPlus {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        while(b>0) {
            a++;
            b--;
        }
          while(b<0) {
            a--;
            b++;
        }
        System.err.println("output : "+a);
        System.err.println("output : "+b);
        int value = -1;
        int res = Math.abs(value);
        System.out.println("math abs : "+res); 
        
         int value1 = -1;
        int res1 = value1>=0 ? value1 : -value1;
        System.out.print("math abs 1 : "+res1); 
    }
}
