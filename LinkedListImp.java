class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
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

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " : node");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class LinkedListImp {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add(10);
        li.add(20);
        li.Display();
        System.out.println(li);
    }    
}