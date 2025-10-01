public class LeetCodeNumberBottles {
    public static int Bottles(int n,int count) {
        int drink = n;    
        int empty = n;    
        while(empty>=count) {
           int NewBottles = empty/count;
            drink += NewBottles;  
            empty = empty % count + NewBottles;  
        }
        return drink;
    }
    public static void main(String[] args) {
        int n = 9;
        int count = 3;
        int results = Bottles(n,count);
        System.out.println("final output : "+results);

    }
}
