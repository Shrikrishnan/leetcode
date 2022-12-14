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
    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeNode A = root;
        if (A==null){
            return new ArrayList<>();
        }
        List<List<Integer>> result =    new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        while(q.size()>0){
             List<Integer> temp = new ArrayList<>();
            int size = q.size();
            for(int i = 0;i<size;i++){
                TreeNode tempa = q.peek();
                temp.add(tempa.val);
                q.remove(q.peek());
                if(!(tempa.left==null)){
                    q.add(tempa.left);
                }
                if(!(tempa.right==null)){
                    q.add(tempa.right);
                }
            }
            result.add(temp);
        }

        return result;

        
    }
}