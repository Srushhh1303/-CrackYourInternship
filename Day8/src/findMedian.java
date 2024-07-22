import java.util.ArrayList;

public class findMedian {
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
    public static float findMedian(TreeNode root){
        if(root==null) return 0;
        if(!isEven(root)) return root.val;
        ArrayList<Integer> list = new ArrayList<>();
        list=median(root,list);
        int mid= list.size()/2;
        int median=(list.get(mid)+list.get(mid))/2;
        return median;
    }

    public static  ArrayList<Integer> median(TreeNode root , ArrayList<Integer> list){
        if(root==null) return null;
        median(root.left,list);
        list.add(root.val);
        median(root.right,list);
        return list;
    }
    public static boolean isEven(TreeNode root){
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        if(root.left!=null || root.right!=null ) return false;
        boolean left=isEven(root.left);
        boolean right=isEven(root.right);
        return left && right;
    }

    public static void main(String args[]){

    }
}
