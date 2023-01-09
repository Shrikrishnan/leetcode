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
**/

class Solution {
    List<Integer> result = new ArrayList<Integer>();
    public void preorde(TreeNode root){
        if(root==null){
            return ;
        }
        preorde(root.left);
        preorde(root.right);
        result.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        preorde(root);
        return result;
    }
}