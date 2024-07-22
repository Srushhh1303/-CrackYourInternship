import java.util.*;

public class Solution {
    public static class TreeNode {
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

    public void printKSumPaths(TreeNode root, int k) {
        List<Integer> path = new ArrayList<>();
        findKSumPaths(root, k, path);
    }

    private void findKSumPaths(TreeNode node, int k, List<Integer> path) {
        // Base case
        if (node == null) {
            return;
        }

        // Add the current node's value to the path
        path.add(node.val);

        // Check if there are any k-sum paths that end at this node
        int sum = 0;
        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i);
            if (sum == k) {
                printPath(path, i);
            }
        }

        // Recur for the left and right subtrees
        findKSumPaths(node.left, k, path);
        findKSumPaths(node.right, k, path);

        // Remove the current node's value from the path to backtrack
        path.remove(path.size() - 1);
    }

    private void printPath(List<Integer> path, int start) {
        for (int i = start; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Construct the binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(-1);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(1);
        root.left.right.left = new TreeNode(1);
        root.right.left = new TreeNode(4);
        root.right.left.left = new TreeNode(1);
        root.right.right = new TreeNode(5);
        root.right.right.right = new TreeNode(2);

        // Define the value of k
        int k = 5;

        // Find and print all k-sum paths
        Solution solution = new Solution();
        solution.printKSumPaths(root, k);
    }
}
