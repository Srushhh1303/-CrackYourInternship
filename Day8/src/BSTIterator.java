import java.util.*;
public class BSTIterator {
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
    Stack<TreeNode> st;
    public BSTIterator(TreeNode root) {
        st=new Stack<>();
        TreeNode curr=root;
        while(curr!=null){
            st.push(curr);
            if(curr.left!=null){
                curr=curr.left;
            }else {
                break;
            }
        }
    }

    public boolean hasNext() {
        return !st.isEmpty();
    }

    public int next() {
        TreeNode nn=st.pop();
        TreeNode curr=nn;
        if(curr.right!=null){
            curr=curr.right;
            while(curr!=null){
                st.push(curr);
                if(curr.left!=null){
                    curr=curr.left;
                }
                else{
                    break;
                }
            }

        }
        return nn.val;
    }

    public void main(String args[]){

    }
}
