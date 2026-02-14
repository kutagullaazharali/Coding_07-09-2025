class BinartTest {
    int val;
    BinartTest left;
    BinartTest right;

    BinartTest() {

    }

    BinartTest(int val) {
        this.val = val;
    }
}

class MainClassTest {
    public static BinartTest insert(BinartTest root, int val) {
        if (root == null) {
            return new BinartTest(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void display(BinartTest root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        display(root.left);

        display(root.right);

    }

    public static BinartTest deleteNode(BinartTest root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            BinartTest successor = findmin(root.right);
            root.val = successor.val;
            deleteNode(root.right, successor.val);
        }
        return root;
    }

    public static BinartTest findmin(BinartTest root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void getdisplay(BinartTest root, int target) {
        if (root == null) {
            return;
        }
        if (target == root.val) {
            System.out.println(root.val);
        }
        getdisplay(root.left, target);
        getdisplay(root.right, target);
        deleteNode(root, 5);
    }

    public static BinartTest createbinarytree(int nums[], int start, int end) {
        if (start > end) {
            return null;
        }
        // System.out.println("test");
        int mid = (end + start) / 2;
        BinartTest tree = new BinartTest(nums[mid]);
        tree.left = createbinarytree(nums, start, mid - 1);
        tree.right = createbinarytree(nums, mid + 1, end);
        return tree;
    }

    public static void main(String[] args) {
        System.out.println("Start");
        BinartTest root = null;
        int nums[] = { 1, 2, 3, 4, 5 };
        for (int i : nums) {
            root = insert(root, i);
        }
        BinartTest node = createbinarytree(nums, 0, nums.length - 1);
        // display(node);
        getdisplay(node, 5);
    }
}