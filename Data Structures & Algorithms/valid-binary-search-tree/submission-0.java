/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
     public boolean inorder(TreeNode root, int[] prev) {
        if (root == null)
            return true;

        // Recursively check the left subtree
        if (!inorder(root.left, prev))
            return false;

        // Check the current node value 
        // against the previous value
        if (prev[0] >= root.val)
            return false;

        prev[0] = root.val;

        // Recursively check the right subtree
        return inorder(root.right, prev);
    }

    // Function to check if the entire binary tree is a BST
     public boolean isValidBST(TreeNode root) {
        int[] prev = { Integer.MIN_VALUE };
        return inorder(root, prev);
    }

}
