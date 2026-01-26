
import java.lang.reflect.Array;
import java.util.ArrayList;

class DestinationCity {
    public static void main(String[] args) {
        ArrayList<List<String>> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("kadiri");
        list1.add("kadapa");

        list.add(new List<String>());
        System.out.println(list);
    }
}