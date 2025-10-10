import java.util.*;  // Import all utility classes

class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // // For displaying student details
    // public String toString() {
    //     return id + " - " + name;
    // }
}

// Custom Comparator to sort students by id
class SortByRoll implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.id - b.id;  // ascending order
    }
}

class SortByName implements Comparator<Student> {
    public int compare(Student a ,Student b ) {
        return a.name.compareTo(b.name);
    }
}

public class MainClass23 {
    public static void main(String[] args) {
        // ✅ Use ArrayList instead of List directly
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student("Ali", 3));
        list.add(new Student("Zara", 1));
        list.add(new Student("Rahul", 2));

        // Sort the list using Comparator
        Collections.sort(list, new SortByName());

        // Print the sorted list
        System.out.println("Sorted by ID:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
