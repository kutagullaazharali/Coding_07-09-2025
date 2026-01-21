import java.util.*;
import java.util.List;
import java.util.LinkedList;
class MiddleElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}