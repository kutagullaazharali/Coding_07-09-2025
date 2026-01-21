public class Maintree{
    static public class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data + " ");
    }
   public static void postOrder(Node root) {
       if (root == null) {
           return;
       }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        System.out.println("Inorder method : ");
        inOrder(root);
        System.out.println();
        System.out.println("PreOrder method : ");
        preOrder(root);
        System.out.println();
        System.out.println("PostOrder method : ");
        postOrder(root);
        System.out.println();
    }
}
