class Node {
    int value;
    Node left, right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree1 {
    Node root;

    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        System.out.println(tree);
    }
}
