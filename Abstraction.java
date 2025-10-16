abstract class phone {
    abstract void open();
    void version() {
        System.out.println("1.0");
    }
}

class vivo extends phone {

@Override
    void open() {
        System.out.println("phone starting");
    }
}

class Abstraction1 {
    public static void main(String[] args) {
        phone c1 = new vivo();
        c1.open();
        c1.version();
    }
}