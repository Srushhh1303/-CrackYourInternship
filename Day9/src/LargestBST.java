public class LargestBST {
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
    static class Info{
        boolean isBST;
        int size;
        int min,max;
        Info( boolean isBST , int size ,int min,int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    static int maxBST=0;
    public static Info largest(TreeNode root){
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

        Info left=largest(root.left);
       Info right= largest(root.right);

       int size= left.size+right.size+1;
       int min=Math.min(Math.min(left.min,right.min), root.val);
       int max=Math.min(Math.max(left.max,right.max), root.val);

       if(root.val<=left.max || root.val>= right.min){
           return new Info(false,size,min,max);
       }
       if(left.isBST && right.isBST) {
           maxBST=Math.max(maxBST,size);
           return new Info(true,size,min,max);
       }
       return new Info(false,size,min,max);
    }

    public static void main(String args[]){

    }
}
