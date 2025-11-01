
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListNormal {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<Integer>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        li.add(50);
        System.out.println(li);
        Iterator itr = li.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ListIterator itr1 = li.listIterator(li.size());
        while (itr1.hasPrevious()) {
            System.out.println(itr1.previous());
        }
    }
}
