
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Teacher {
    int id;
    String name;

    public Teacher(int id,String name) {
        this.id = id;
        this.name = name;
    }
public static class newClass implements Comparator<Teacher> {
    @Override
    public int compare(Teacher t1, Teacher t2) {
        if (t1.id > t2.id) {
            return 1;
        } else if (t1.id < t2.id) {
            return -1;
        } else {
            return 0;
        }
    }
}
    public static void main(String[] args) {
        List<Teacher> list = new ArrayList<Teacher>();
        list.add(new Teacher(141, "John 0"));
        list.add(new Teacher(131, "John 1"));
        list.add(new Teacher(101, "John 2"));
        list.add(new Teacher(111, "John 3"));
        Collections.sort(list, new newClass());

        for(Teacher t : list) {
            System.out.println("id : "+ t.id);
            System.out.println("name : "+t.name);
        }
    }
}

