import java.util.*;

public class Student1 {
    int id;
    String name;
    public Student1(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1(1, "azhar");
        Student1 s2 = new Student1(2, "Ali");
        Student1 s3 = new Student1(3, "Raj");
        Student1 s4 = new Student1(4, "Rani");
        System.out.println("Student 1 id : "+s1.id + " - Student 1 name : "+s1.name);
        System.out.println("Student 2 id : "+s2.id + " - Student 2 name : "+s2.name);
        System.out.println("Student 3 id : "+s3.id + " - Student 3 name : "+s3.name);
        System.out.println("Student 4 id : "+s4.id + " - Student 4 name : "+s4.name);
    }
}
