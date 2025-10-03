public class CheckNumberDesc {
    public static void main(String[] args) {
        int num = 54312;
        int prevdigit = num%10;
        num/=10;
        boolean flag = true;
        while (num!=0) {
            int current = num%10;
            if(current < prevdigit){
                System.out.println("not desc");
                flag = false;
                break;
            }
            prevdigit = current;
            num/=10;
        }
        if(flag) {
            System.out.println("desc");
        }
        else {
            System.out.println("not desc");
        }
    }
}
