public class BalancedBST {
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
    boolean result=true;
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
    }
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        if(Math.abs(l-r)>1) result= false;
        return Math.max(l,r)+1;
    }

    public void main(String args[]){

    }
}
