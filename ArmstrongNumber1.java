public class ArmstrongNumber1 {
     public static int ArmStrong(int n,int len){
        int sum = 0; 
        while(n!=0) {
            int last = n%10;
            sum += Math.pow(last,len);
            n/=10; 
        }
        return sum;
    }
    
     public static void main(String []args){
        int num = 153;
        int count = 0;
        int temp = num;
        while(temp!=0){
            count++;
            temp/=10;
        }
        int res = ArmStrong(num,count);
        if(res==num) { 
            System.out.println("ArmStrong Number : " +num);
        }
        else {
            System.out.println("Not ArmStrong Number : " +num);
        }

     }
}
