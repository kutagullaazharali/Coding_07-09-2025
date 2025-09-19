public class Simple {
    String name;

    public Simple(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.length();
    }

    public static void main(String[] args) {
        Simple s1 = new Simple("a");
        Simple s2 = new Simple("a");
        Simple s3 = new Simple("a");
        Simple s4 = new Simple("k");
        System.out.println("name : " + s1.name);
        System.out.println("s1.hashCode() : " + s1.hashCode());
        System.out.println("name : " + s2.name);
        System.out.println("s2.hashCode() : " + s2.hashCode());
        System.out.println("name : " + s3.name);
        System.out.println("s3.hashCode() : " + s3.hashCode());
        System.out.println("name : " + s4.name);
        System.out.println("s3.hashCode() : " + s4.hashCode());
    }
}