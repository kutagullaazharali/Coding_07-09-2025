class FatherClass {
    int age;
    String name;

    public FatherClass(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public FatherClass(int age) {
        this.age = age;
    }
}

class ChildClass extends FatherClass {
    int age;
    String name;

    public ChildClass(int age, String name) {
        this(20);
        this.age = age;
        this.name = name;
    }

    public ChildClass(int age) {
        super(50);
        this.age = age;
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass(21, "rohan");
        FatherClass father = new FatherClass(44, "kumar");

        System.out.println("child object : " + child.name +" : "+ child.age);
        System.out.println("father object : " + father.name +" : "+ father.age);
    }
}