interface mobile {
    void versionupdate();

    public static void features() {
        System.out.println("calls,games");
    }

    default void phonecolor() {
        System.out.println("black");
    }
}

class apple implements mobile{
    @Override
    public void versionupdate() {
        System.out.println("5.0");
    }
}

public class Interface {
    public static void main(String[] args) {
        mobile a = new apple();
        a.versionupdate();
       mobile.features();
    }
}
