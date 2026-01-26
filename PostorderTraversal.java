class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class PostorderTraversal {

    // Postorder Traversal Method
    static void postorder(Node root) {

        // Base condition
        if (root == null) {
            return;
        }

        // Left subtree
        postorder(root.left);

        // Right subtree
        postorder(root.right);

        // Root
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {

        // Creating Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Postorder Traversal:");
        postorder(root);
    }
}
