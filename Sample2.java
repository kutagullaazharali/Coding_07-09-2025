public class Sample2 {
    int id;
    String name;

    public Sample2(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public Sample2(Sample2 s) {
     this.id = s.id;
    this.name = s.name;
    }
    
    public static void main(String[] args) {
        Sample2 sam1 = new Sample2(1,"azhar");
        Sample2 sam2 = new Sample2(sam1);

        System.out.println(sam1.name);
        System.out.println(sam2.name);
        System.out.println(sam1.name.equals(sam2.name));
    }
}
