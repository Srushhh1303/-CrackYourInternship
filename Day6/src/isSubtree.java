public class isSubtree {
    public class TreeNode {
        int val;
       TreeNode left;
      TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;

        if(isIdentical(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if( root==null || subRoot==null ){
            return false;
        }
        if(root.val != subRoot.val) return false;
        // if( isIdentical(root.left,subRoot.left)) return false;
        //  if(isIdentical(root.right,subRoot.right)) return false;

        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);

    }
    public static void main(String[] args){

    }
}
