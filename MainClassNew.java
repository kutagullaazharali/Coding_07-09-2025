import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

class treeClass {

    int val;
    treeClass left, right;

    treeClass(int val) {
        this.val = val;
    }

    treeClass() {

    }

}

class MainClassNew {
    public static void inordertravel(treeClass root) {
        if (root == null) {
            return;
        }

        inordertravel(root.left);
        System.out.println(root.val);
        inordertravel(root.right);
    }

    public static void preordertravel(treeClass root) {
        if (root == null) {
            return;
        }

        System.out.println(root.val);
        preordertravel(root.left);
        preordertravel(root.right);
    }

    public static void postordertravel(treeClass root) {
        if (root == null) {
            return;
        }

        postordertravel(root.left);
        postordertravel(root.right);
        System.out.println(root.val);
    }

    public static void treeLevelTraversal(treeClass root) {
        if (root == null) {
            return;
        }
        Queue<treeClass> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> temp = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                treeClass node = queue.poll();
                temp.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            list.add(temp);
        }
        System.out.println(list);
    }

    public static treeClass insert(treeClass root, int val) {
        if (root == null) {
            return new treeClass(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void main(String args[]) {
        treeClass tree = new treeClass();
        // tree.left = new treeClass(2);
        // tree.right = new treeClass(3);

        // tree.left.left = new treeClass(4);
        // tree.left.right = new treeClass(5);

        // tree.right.right = new treeClass(6);
        // tree.right.left = new treeClass(7);
        int[] arr = { 10, 5, 15, 3, 7, 12, 18 };
        for (int i : arr) {
            tree = insert(tree, i);
        }
        System.out.println("===InOrder========================================");
        inordertravel(tree);
        System.out.println("===PreOrder========================================");
        preordertravel(tree);
        System.out.println("===PostOrder=======================================");
        postordertravel(tree);
        System.out.println("===TreeLevelTraversal==============================");
        treeLevelTraversal(tree);

        Integer[] arrInteger = { -10, null, -3, null, 0, null, 5, null, 9 };
        if (arrInteger.length == 0 && arrInteger[0] == null) {
            System.out.println("Empty Array.............");
        }
        treeClass newtree = new treeClass(arrInteger[0]);
        Queue<treeClass> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        
        queue.add(newtree);
        int i = 1;
        while (i < arrInteger.length && !queue.isEmpty()) {
            treeClass current = queue.poll();
            if (i < arrInteger.length && arrInteger[i] != null) {
                current.left = new treeClass(arrInteger[i]);
                queue.add(current.left);
            }
            i++;
            if (i < arrInteger.length && arrInteger[i] != null) {
                current.right = new treeClass(arrInteger[i]);
                queue.add(current.right);
            }
            i++;
        }

        System.out.println(" New Tree ===InOrder========================================");
        inordertravel(newtree);
        System.out.println(" New Tree ===PreOrder========================================");
        preordertravel(newtree);
        System.out.println(" New Tree ===PostOrder=======================================");
        postordertravel(newtree);
        System.out.println(" New Tree ===TreeLevelTraversal==============================");
        treeLevelTraversal(newtree);       
    }
}
