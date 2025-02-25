public class ReversePairs {
    class Node {
        int val, cnt;
        Node left, right;

        Node(int val) {
            this.val = val;
            this.cnt = 1;
        }
    }
    private int search(Node root, long val) {
        if (root == null) {
            return 0;
        } else if (val == root.val) {
            return root.cnt;
        } else if (val < root.val) {
            return root.cnt + search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }

    private Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
        } else if (val == root.val) {
            root.cnt++;
        } else if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.cnt++;
            root.right = insert(root.right, val);
        }

        return root;
    }
    public static void main(String[] args) {


    }
}
