public class RecoverBT {public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
    TreeNode firstElement = null;
    TreeNode secondElement = null;
    TreeNode prevElement = new TreeNode(Integer.MIN_VALUE); // To handle edge cases with negative values in the tree

    public void recoverTree(TreeNode root) {
        // In order traversal to find the two elements
        inorder(root);

        // Swap the values of the two nodes
        if (firstElement != null && secondElement != null) {
            int temp = firstElement.val;
            firstElement.val = secondElement.val;
            secondElement.val = temp;
        }
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        // Traverse the left subtree
        inorder(root.left);

        // If first element has not been found, assign it to prevElement (the first out-of-order node)
        if (firstElement == null && prevElement.val >= root.val) {
            firstElement = prevElement;
        }

        // If first element is found, assign the second element to the root (the second out-of-order node)
        if (firstElement != null && prevElement.val >= root.val) {
            secondElement = root;
        }

        // Update prevElement to the current node
        prevElement = root;

        // Traverse the right subtree
        inorder(root.right);
    }

    public static void main(String args[]){

    }

}
