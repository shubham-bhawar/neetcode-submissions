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
    boolean flag = true;
    public int isBalance(TreeNode head){
        if(head==null) return 0;
        int leftHt = isBalance(head.left);
        int rightHt = isBalance(head.right);
        if(Math.abs(leftHt-rightHt)>1) flag = false;
        return 1 + Math.max(leftHt,rightHt);
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        isBalance(root);
        return flag;
    }
}
