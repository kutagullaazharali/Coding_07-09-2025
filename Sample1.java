

public class Sample1 {
    int id ;
    String name;
    public Sample1(String name,int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return name +" "+id;
    }
    public static void main(String[] args) {
        Sample1 s = new Sample1("hello",1);
        System.out.println(s);
    }
}
