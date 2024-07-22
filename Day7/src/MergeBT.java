public class MergeBT {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return null;
        if(root1!=null && root2!=null){
            root1.val+=root2.val;
        }
        if(root1==null && root2!=null){
            root1.val=root2.val;
        }
        mergeTrees(root1.left,root2.left);
        mergeTrees(root1.right,root2.right);

        return root1;
    }
    public static void main(String args[]){

    }
}
