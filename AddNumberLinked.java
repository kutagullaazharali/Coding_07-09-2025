class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AddNumberLinked {
    public static void main(String[] args) {
        Node1 n1 = new Node1(2);
        Node1 n2 = new Node1(4);
        Node1 n3 = new Node1(3);
        n1.next = n2;
        n2.next = n3;

        Node2 num1 = new Node2(5);
        Node2 num2 = new Node2(6);
        Node2 num3 = new Node2(4);
        num1.next = num2;
        num2.next = num3;

        Node1 head = n1;
        int sum1 = 0;
        String s1 = "";
        while (head != null) {
            Node1 ele = head;
            sum1 += ele.data;
            s1 = ele.data + s1;
            System.out.println(ele.data);
            head = head.next;
        }

        Node2 head1 = num1;
        String s2 = "";
        int sum2 = 0;
        while (head1 != null) {
            Node2 ele1 = head1;
            sum2 += ele1.data;
            s2 = ele1.data + s2;
            System.out.println(ele1.data);
            head1 = head1.next;
        }
        System.out.println(s1);
        System.out.println(s2);
        int res = Integer.valueOf(s1) + Integer.valueOf(s2);
        System.out.println("results : "+res);
        System.out.println("Sum 1 : " + sum1);
        System.out.println("Sum 2 : " + sum2);
        System.out.println(sum1 + sum2);
    }
}
