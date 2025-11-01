class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCode {
    Node head;
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Node : " + temp.data);
            temp = temp.next;
        }
    }
    

    public boolean delete(int key) {
        Node temp = head;
        Node prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return true;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedListCode list = new LinkedListCode();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.delete(10);
        list.display();
    }
}