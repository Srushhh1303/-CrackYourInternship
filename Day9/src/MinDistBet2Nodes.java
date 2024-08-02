import com.sun.source.tree.Tree;

public class MinDistBet2Nodes {
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
    public static TreeNode lca(TreeNode root,int a ,int b){
        if(root==null) return null;

        if(root.val==a || root.val==b) return root;
        TreeNode leftlca = lca(root.left, a, b);
        TreeNode rightlca=lca( root.right, a , b);

        if(leftlca==null) return rightlca;
        else if(rightlca==null) return leftlca;

        return root;
    }
    public static int minDist(TreeNode root,int a ,int b){
        TreeNode lca=lca(root,a,b);
        int dist1=distance(root,a);
        int dist2=distance(root,b);
        return dist1+dist2;
    }

    public static int distance(TreeNode root,int a){
        if(root==null) return -1;
        if(root.val==a) return 0;
        int left=distance(root.left,a);
        int right=distance(root.right,a);

        if(left!=-1) return left+1;
        if(right!=-1) return right+1;

        return -1;

    }

    public static void main(String args[]){

    }
}
