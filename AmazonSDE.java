public class AmazonSDE {
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static int SDEQuestion(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node rev = reverseList(slow);
        slow = head;
        int output = 0;
        while (rev != null) {
            output = Math.max(slow.val + rev.val, output);
            slow = slow.next;
            rev = rev.next;
        }
        return output;
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        System.out.println("Original Linked List:");
        int output = SDEQuestion(head);
        System.out.println("final output : " + output);
        // reverseList(head);
    }
}