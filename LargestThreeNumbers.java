public class LargestThreeNumbers {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 6;
        int n3 = 7;
        if(n1>=n2 && n1>=n3) {
            System.out.println("largest : "+n1);
        }
        else if(n2>=n3 && n2>=n3) {
            System.out.println("largest : "+n2);
        }
        else{
             System.out.println("largest : "+n3);
        }


        int results = (n1>n2 && n2>n3 )? n1:(n2>n3) ? n2 : n3;
        System.out.println("final output : "+results);

        int output = Math.max(n1, Math.max(n2, n3));
        System.out.println("math.max : "+output);
    }
}
