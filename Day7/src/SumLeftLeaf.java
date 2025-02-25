public class SumLeftLeaf {
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
    public static int helper(TreeNode root,boolean isLeft){
        if(root==null) return 0;
        if(root.left==null && root.right==null && isLeft){
            return root.val;
        }
        return helper(root.left,true) + helper(root.right,false);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return helper(root,false);
    }
    public void main(String args[]){

    }
}
