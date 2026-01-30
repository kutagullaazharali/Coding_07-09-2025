import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

class Tree {
    int val;
    Tree left, right;

    public Tree(int val) {
        this.val = val;
    }
}

public class LeftViewTree {
    public static void PrintLeftView(Tree root) {
        if (root == null) {
            return;
        }
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Tree curr = queue.poll();
                if (i == 0) {
                    System.out.println(curr.val + " ");
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
                if (curr.left != null) {
                    queue.add(curr.left);
                }
            }
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(2);
        tree.right = new Tree(3);
        tree.left.left = new Tree(4);
        tree.left.right = new Tree(5);
        tree.right.right = new Tree(6);
        PrintLeftView(tree);
    }
}
