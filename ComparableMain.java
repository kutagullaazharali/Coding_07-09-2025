import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int id;

    public Student(String name, int id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + "}";
    }
}


public class ComparableMain {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();
        list.add(new Student("ali1",22));
        list.add(new Student("ali3",11));
        list.add(new Student("ali4",99));
        list.add(new Student("azhar", 0));
        list.add(new Student("ali",1));
        Collections.sort(list);
        for(Student s : list) {
            System.out.println(s);
        }
    }
}
