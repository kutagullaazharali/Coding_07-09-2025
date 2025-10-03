public class findLargeNumber {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 6;
        if(n1>n2) {
            System.out.println("large number : "+n1);
        }
        else if(n2>n1){
            System.out.println("large number : "+n2);
        }
        else {
            System.out.println("both equal");
        }

        int output = (n1>n2) ? n1 : n2;
        System.out.println(output);

        int finalApproach = Integer.compare(n1, n2);
        if(finalApproach > 0){
            System.out.println("large number : "+n1);
        }
        else if(finalApproach<0){
            System.out.println("large number : "+n2);
        }
        else{
        System.out.println("same: " + finalApproach);
        }
    }
}
