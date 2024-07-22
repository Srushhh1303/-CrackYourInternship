import java.util.*;
public class BinaryTreePath {
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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return null;
        List<String> list=new ArrayList<>();
        if(root!=null) paths(root,"" , list);
        return list;
    }
    public void paths(TreeNode root,String path,List<String> list){
        if(root.left==null && root.right==null) list.add(path + root.val);
        if(root.left!=null) paths(root.left,path+root.val+"->",list);
        if(root.right!=null) paths(root.right,path+root.val+"->",list);
    }
    public List<String> binaryTreePaths2(TreeNode root) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(res, root, sb);
        return res;
    }

    private void helper(List<String> res, TreeNode root, StringBuilder sb) {
        if(root == null) {
            return;
        }
        int len = sb.length();
        sb.append(root.val);
        if(root.left == null && root.right == null) {
            res.add(sb.toString());
        } else {
            sb.append("->");
            helper(res, root.left, sb);
            helper(res, root.right, sb);
        }
        sb.setLength(len);
    }
    public static void main(String args[]){

    }
}
