class Nodenew {
    int value;
    Nodenew left, right;
    Nodenew(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinaryTree1 {
    Nodenew root;

    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();
        tree.root = new Nodenew(1);
        tree.root.left = new Nodenew(2);
        tree.root.right = new Nodenew(3);
        System.out.println(tree);
    }
}
