
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(60);
        list.add(40);
        list.add(10);
        list.add(20);
        Collections.sort(list);
        System.out.println(list);
        Iterator itr = new Iterator(list);
    }
}
