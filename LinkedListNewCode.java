public class LinkedListNewCode {
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        System.out.println("Reverse List");
        while (prev != null) {
            System.out.println("Element : " + prev.val);
            prev = prev.next;
        }
    }

    public static void slowAndfast(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Slow : "+slow.val);
        System.out.println("Fast : "+fast.val);
    }
    public static void printList(Node head) {
            while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        System.out.println("Original Linked List:");
        printList(head);
        slowAndfast(head);
        reverseList(head);
    }
}