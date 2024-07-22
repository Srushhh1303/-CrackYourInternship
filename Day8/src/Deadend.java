public class Deadend {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }

        public boolean isDeadEnd(Node root) {
            return helper(root, 1, Integer.MAX_VALUE);
        }

        boolean helper(Node root, int min, int max) {
            if (root == null) return false;
            else if (min == max) return true;
            boolean left = helper(root.left, min, root.data - 1);
            boolean right = helper(root.right, root.data + 1, max);

            return left || right;

        }
    }
    public static void main(String argsp[]){

    }
}
