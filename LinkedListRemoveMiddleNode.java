import java.util.*;

class Nodetest {
    int val;
    Nodetest next;

    Nodetest(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedListRemoveMiddleNode {
    Nodetest node;

    public void insert(int val) {
        Nodetest newNode = new Nodetest(val);

        if (node == null) {
            node = newNode;
            return;
        }

        Nodetest temp = node;

        // FIXED CONDITION
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void printMethod() {
        Nodetest temp = node;

        while (temp != null) {
            System.out.println("Data : " + temp.val);
            temp = temp.next;
        }
    }

    public void printMiddleMethod() {
        Nodetest fast = node;
        Nodetest slow = node;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // System.out.println("Last Element : " + fast.val);
        // System.out.println("Middle Element : " + slow.val);
    }

    public void removeMiddleMethod() {
        Nodetest fast = node;
        Nodetest slow = node;
        int count = -1;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            count++;
        }
        // System.out.println(count);
        Nodetest dup = node;
        while (count != 0) {
            dup = dup.next;
            count--;
        }
        dup.next = dup.next.next;
    }

    public static void main(String[] args) {

        LinkedListRemoveMiddleNode list = new LinkedListRemoveMiddleNode();

        list.insert(1);
        list.insert(3);
        list.insert(4);
        list.insert(7);
        list.insert(1);
        list.insert(2);
        list.insert(6);

        System.out.println("------------------");

        list.printMethod();
        list.printMiddleMethod();
        list.removeMiddleMethod();
        System.out.println("------------------");
        list.printMethod();
    }
}