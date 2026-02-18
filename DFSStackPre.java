class Node1 {
    int val;
    Node1 left, right;

    public Node1() {

    }

    public Node1(int val) {
        this.val = val;
        left = right = null;
    }
}

public class DFSStackPre {
    public static void inorder(Node1 root) {
        if (root == null) {
            return;
        }
        
        inorder(root.left);
        inorder(root.right);
        System.out.println(root.val);
    }

    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);
        inorder(root);
    }
}
