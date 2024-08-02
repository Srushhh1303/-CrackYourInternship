
import java.io.*;
import java.util.*;
    class PreorderBST {
        static class Node {
            int data;
            Node left, right;

            Node(int d) {
                data = d;
                left = right = null;
            }
        }

        static class Solution {
            // Function that constructs BST from its preorder traversal.
            public Node Bst(int pre[], int size) {

                // code here
                if (size == 0) return null;
                Node root = new Node(pre[0]);
                for (int i = 1; i < size; i++) {
                    insert(root, pre[i]);
                }
                return root;
            }

            public static Node insert(Node root, int x) {
                if (root == null) {
                    return new Node(x);
                }
                if (root.data > x) {
                    root.left = insert(root.left, x);
                } else if (root.data < x) {
                    root.right = insert(root.right, x);
                }
                return root;
            }
        }

        public static void main(String[] args) throws IOException {

        }

    }