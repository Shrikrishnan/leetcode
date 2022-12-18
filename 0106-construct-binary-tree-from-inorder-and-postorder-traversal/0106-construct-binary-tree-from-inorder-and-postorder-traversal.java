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



public class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public TreeNode tree(int[] in,int [] po,int sin,int ein,int spo,int epo){
        if (sin>ein){
            return null;
        }
        //  Main logick 
        TreeNode root  = new TreeNode(po[epo]);
        int idx  =  map.get(po[epo]);
        int LST  =  idx-sin;
        root.left=tree(in,po,sin,idx-1,spo,spo+LST-1);
        root.right=tree(in,po,idx+1,ein,spo+LST,epo-1);
        return root;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
   
        int[] A= inorder;
        int[] B = postorder;
        //  Creation of the HashMap map 
        for(int i = 0; i<A.length;i++){
            map.put(A[i],i);
        }
        return tree(A,B,0,A.length-1,0,B.length-1);
        
    }
}