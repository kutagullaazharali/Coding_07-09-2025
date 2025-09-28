

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Student implements  Comparable<Student> {
    int id ;
    String name;

    public Student(int id,String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public int compareTo(Student that){
        if(this.id < that.id) {
            return 1;
        }
        else {
            return-1;
        }
    }

    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(1, "azhar"));
        studs.add(new Student(2, "ali"));
        studs.add(new Student(0, "kutagulla"));
        Collections.sort(studs);
        for(Student s : studs) {
            System.out.println(s.id);
            System.out.println(s.name);
            System.out.println("-------");
        }
    }
}