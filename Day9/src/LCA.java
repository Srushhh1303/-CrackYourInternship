// FUNCTION CODE

class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}

/* Should return minimum distance between a and b
   in a tree with given root*/
class LCA {
    // Function to find the lowest common ancestor (LCA) of two nodes
    Node lca(Node root, int a, int b) {
        if (root == null) return null;
        if (root.data == a || root.data == b) return root;

        Node leftLca = lca(root.left, a, b);
        Node rightLca = lca(root.right, a, b);

        if (leftLca != null && rightLca != null) return root;
        return (leftLca != null) ? leftLca : rightLca;
    }

    // Function to find the distance from root to the given node
    int dis(Node root, int a) {
        if (root == null) return -1;
        if (root.data == a) return 0;

        int left = dis(root.left, a);
        int right = dis(root.right, a);

        if (left != -1) return left + 1;
        if (right != -1) return right + 1;
        return -1;
    }

    // Function to find the distance between two nodes
    int findDist(Node root, int a, int b) {
        Node lca = lca(root, a, b);
        if (lca == null) return -1; // If LCA doesn't exist (shouldn't happen for valid input)

        int dist1 = dis(lca, a);
        int dist2 = dis(lca, b);

        return dist1 + dist2;
    }
    public static void main(String args[]){

    }
}
