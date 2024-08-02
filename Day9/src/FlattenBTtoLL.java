import java.util.*;
public class FlattenBTtoLL {
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
    public void flatten(TreeNode root) {
        if(root==null) return;
        ArrayList<TreeNode> list=new ArrayList<>();
        preorder(root,list);
        TreeNode temp=root;
        for(int i=1;i<list.size();i++){
            temp.left=null;
            temp.right=list.get(i);
            temp=temp.right;
        }
    }
    public void preorder(TreeNode root,ArrayList<TreeNode> list){
        if(root==null) return;
        list.add(root);
        preorder(root.left,list);
        preorder(root.right,list);
    }

    public static void main(String args[]){

    }
}
