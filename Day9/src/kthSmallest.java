public class kthSmallest {
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
    int result=0;
    int count=0;
    public int kthSmallest(TreeNode root, int k) {

        inorderTraversal(root, k);
        return result;
    }

    public void inorderTraversal(TreeNode root,int k) {
        if (root == null) return ;
        inorderTraversal(root.left,k);
        count++;
        if(count==k){
            result= root.val ;
            return;
        }
        inorderTraversal(root.right,k);

    }
    public static void main(String args[]){

    }
}
