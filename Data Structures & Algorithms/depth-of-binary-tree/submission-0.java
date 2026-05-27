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
    int maxDepth = Integer.MIN_VALUE;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int lht = maxDepth(root.left);
        int rht = maxDepth(root.right);

        maxDepth = Math.max(maxDepth,1+Math.max(lht,rht));

        return 1+Math.max(lht,rht);
    }
}
