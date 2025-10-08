abstract class vehicle{
   abstract void start();

   void stop() {
    System.out.println("vehicle stopped");
   }
}
class car extends vehicle {

    @Override
    void start() {
        System.out.println("car starting");
    }
}
public class MainMethod {
    public static void main(String[] args) {
        vehicle v = new car();
        v.start();
        v.stop();
    }
}