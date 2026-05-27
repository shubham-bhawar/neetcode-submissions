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
    public boolean isSameTree(TreeNode first , TreeNode second){
        if(first == null && second == null) return true;
        if(first==null && second != null ) return false;
        if(second==null && first != null ) return false;
        return first.val == second.val && isSameTree(first.left,second.left) && isSameTree(first.right,second.right) ;
    }
    boolean flag = false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        if(root == null && subRoot != null) return false;
        if(isSameTree(root,subRoot)) return true;
        boolean leftAns = isSubtree(root.left,subRoot);
        boolean rightAns = isSubtree(root.right,subRoot);
        return leftAns || rightAns ;
        
    }
}
