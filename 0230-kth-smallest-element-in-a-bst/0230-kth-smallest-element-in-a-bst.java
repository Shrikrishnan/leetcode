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
    static int kk = 0;
    public int kthSmallest(TreeNode root, int k) {
        kk = k;
        return find(root);
    }
    public static int find(TreeNode root) {
         if (root == null)
             return -1;
         // We do an inorder traversal here. 
         int k1 = find(root.left);
         if (kk == 0)
             return k1; // left subtree has k or more elements.
         kk--;
         if (kk == 0)
             return root.val; // root is the kth element.
         return find(root.right); // answer lies in the right node.
}
}
