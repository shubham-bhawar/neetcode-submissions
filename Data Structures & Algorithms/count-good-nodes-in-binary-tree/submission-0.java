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

    public void countNodesHigher(TreeNode root , int [] count , int maxValueOfPath){
        if(root == null) return ;
        if(root.val >= maxValueOfPath){
            count[0] = count[0]+1;
        }
        countNodesHigher(root.left,count,Math.max(maxValueOfPath,root.val));
        countNodesHigher(root.right,count,Math.max(maxValueOfPath,root.val));

    }

    public int goodNodes(TreeNode root) {
        int [] countNodes = new int[]{0};
        countNodesHigher(root,countNodes,Integer.MIN_VALUE);
        return countNodes[0];
    }
}
