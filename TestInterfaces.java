interface MotherBoard {
    double DeviceInfo();
   default void reset() {
    System.err.println("mother board resetting...");
    }
}

interface Software {
    default void reset() {
        System.out.println("resetting the software......");
    }
}

class Phone implements MotherBoard, Software {

    @Override
    public double DeviceInfo() {
        return 1.0;
    }
    @Override
    public void reset() {
        MotherBoard.super.reset();
        Software.super.reset();
    }

}

public class TestInterfaces {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.reset();
        p.DeviceInfo();
    }
}
