public class ConstructTreePreorder {
    public static class TreeNode {
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

    public static TreeNode buildTree(int[] inorder, int[] preorder, int n) {
        int preIdx = 0;
        TreeNode ans = solve(inorder, preorder, preIdx, 0, n - 1, n);
        return ans;
    }

    public static TreeNode solve(int[] inorder, int[] preorder, int preIdx, int start, int end, int n) {
        if (preIdx >= n || start > end) {
            return null;
        }
        int element = preorder[preIdx++];
        TreeNode root = new TreeNode(element);
        int position = findPos(inorder, element, n);

        //recusrive calls;
        root.left = solve(inorder, preorder, preIdx, start, -position - 1, n);
        root.right = solve(inorder, preorder, preIdx, position + 1, end, n);

        return root;
    }


    public static int findPos(int[] inorder,int element,int n){
        for(int i=0;i<n;i++){
            if(inorder[i]==element){
                return i;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int inorder[]= {3,1,4,0,5,2};
        int preorder[]={0,1,3,4,2,5};
        buildTree(inorder,preorder,inorder.length-1);

    }
}
