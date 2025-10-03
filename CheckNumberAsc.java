public class CheckNumberAsc {
    public static void main(String[] args) {
        int n = 12435;
        int original = n;
        boolean flag = true;
        int prevdigit = 10;
        while(n != 0){
            int last = n%10;
            if(last > prevdigit) {
                flag = false;
                break;
            }
            prevdigit = last; 
            n/=10;
        }
        if(flag){
            System.out.println("Ascending order");
        }
        else {
            System.out.println("Descending order");
        }
    }
}
