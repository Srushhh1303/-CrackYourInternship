public class Diameteroftree {
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
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ld=diameterOfBinaryTree(root.left);
        int rd= diameterOfBinaryTree(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        int di=lh+rh;

        return Math.max(Math.max(ld,rd),di);
    }
    public static class info {
        int dia, height;
        info( int dia,int height){
            this.dia=dia;
            this.height=height;
        }
    }

    public info optimised(TreeNode root){
        if(root==null){
            return new info(0,0);
        }
        info leftinfo=optimised(root.left);
        info rightinfo=optimised(root.right);
        int dia=Math.max(leftinfo.height + rightinfo.height+ 1 ,Math.max(leftinfo.dia ,rightinfo.dia));
        int hei=Math.max(leftinfo.height, rightinfo.height)+1;
        return new info(dia,hei);
    }
    public static void main(String[] args){

    }
    }
