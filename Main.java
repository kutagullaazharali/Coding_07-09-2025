class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        return dfs(root).node;
    }

    // Helper class to return depth and node together
    class Result {
        TreeNode node;
        int depth;

        Result(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    private Result dfs(TreeNode root) {
        if (root == null) {
            return new Result(null, 0);
        }

        Result left = dfs(root.left);
        Result right = dfs(root.right);

        if (left.depth > right.depth) {
            return new Result(left.node, left.depth + 1);
        } else if (left.depth < right.depth) {
            return new Result(right.node, right.depth + 1);
        } else {
            // Left and right depths are equal → root is LCA of deepest nodes
            return new Result(root, left.depth + 1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create the tree
        /*
                3
               / \
              5   1
             / \
            6   2
               / \
              7   4
        */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        // Call solution
        Solution solution = new Solution();
        TreeNode subtreeRoot = solution.subtreeWithAllDeepest(root);

        // Print the value of the subtree root
        System.out.println("Root of the smallest subtree containing all deepest nodes: " + subtreeRoot.val);

        // Optional: print all nodes in the subtree
        System.out.print("Nodes in the subtree: ");
        printTree(subtreeRoot);
    }

    // Helper method to print tree in preorder
    public static void printTree(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
