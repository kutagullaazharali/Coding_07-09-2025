class ListNode {
    int data;
    ListNode next;
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedList {
    ListNode head;
    public void add(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }
    
    public void displayMethod() {
        ListNode temp = head;
        while (temp != null) {
            System.out.println("node : " + temp.data);
            temp = temp.next;
        }
    }

    public void ReverseList() {
        ListNode prev = null;
        ListNode current = head;
        ListNode next1 = null;
        while (current != null) {
            next1 = current.next;
            current.next = prev;
            prev = current;
            current = next1;
        }
        while (prev != null) {
            System.out.println("Node : " + prev.data);
            prev = prev.next;
        }
        
    }

    

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.displayMethod();
        list.ReverseList();
    }
}
