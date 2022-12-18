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
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode tree(int[] pr,int[] in,int spr,int epr,int sin,int ein){
        if(spr>epr){
            return null;
        }
        TreeNode root = new TreeNode (pr[spr]);
        int idx = map.get(pr[spr]);
        int lst = idx-sin;
        root.left = tree(pr,in,spr+1,spr+lst,sin,idx-1);
        root.right= tree(pr,in,spr+lst+1,epr,idx+1,ein);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        // Creation of the Hash map for the 
        for (int i =0 ;i<inorder.length ; i++){
            map.put(inorder[i],i);
        }
        return tree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
}