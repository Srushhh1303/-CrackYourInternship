import java.util.*;
public class ContructBTPrePost {
    public class TreeNode {
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
    private HashMap<Integer, Integer> map;
    private int preIdx = 0;

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        map = new HashMap<>();
        for (int i = 0; i < postorder.length; i++) {
            map.put(postorder[i], i);
        }
        return buildTree(preorder, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] postorder, int postStart, int postEnd) {
        if (postStart > postEnd || preIdx >= preorder.length) return null;

        TreeNode root = new TreeNode(preorder[preIdx++]);

        if (postStart == postEnd || preIdx >= preorder.length) return root;

        int postIndex = map.get(preorder[preIdx]);

        root.left = buildTree(preorder, postorder, postStart, postIndex);
        root.right = buildTree(preorder, postorder, postIndex + 1, postEnd - 1);

        return root;
    }

    public static void main(String args[]){

    }
}
