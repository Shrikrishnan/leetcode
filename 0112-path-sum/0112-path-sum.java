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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int a = hasPathSumm(root,targetSum);
        if(a==1){
            return true;
        }
        return false;
        
    }
    
    private int sumPath(TreeNode root, int sum, int target)
    {
        if(root == null)
            return 0;

        sum = sum + root.val;
        int l = sumPath(root.left, sum, target);
        int r = sumPath(root.right, sum, target);

        if(l == 1 || r == 1)
            return 1;

        if(sum == target && root.left == null && root.right == null)
            return 1;
        else
            return 0;
    }

    public int hasPathSumm(TreeNode A, int B) {
        return sumPath(A, 0, B);
    }
}