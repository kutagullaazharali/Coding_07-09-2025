import java.util.*;
public class DoubleBraceInitialization {
    public static void main(String args[]) {
        Set<String> list = new HashSet<String>() {
            {
                add("hello");
                add("hi");
                add("bye");
            }
        };
        System.out.println(list);

        // List<String> listNew = new ArrayList<>(List.of("hello", "hi", "bye"));
        // List<String> list1 = new ArrayList<>(List.of("Apple", "Banana", "Orange"));
        System.out.println('b' + 'i' + 't');
        System.out.println('a'+0);
        System.out.println('i'+0);
    }
}
