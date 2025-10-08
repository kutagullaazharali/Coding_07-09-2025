class Single {
    private static final  Single instance =  new Single();
    private Single() {

    }
    public static Single getInstance() {
        return instance;
    }
}
public class SingleTonClass {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        if(s1 == s2) {
            System.out.println("final output : " + true);
        }
        else {
            System.out.println("final output : " + false);
        }
    }
}
