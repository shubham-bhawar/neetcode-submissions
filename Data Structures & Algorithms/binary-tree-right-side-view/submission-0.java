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
    public List<Integer> rightSideView(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res = new LinkedList<>();
        q.add(root);
        if(root==null) return res;

        while(!q.isEmpty()){
            int size = q.size();
            while(size != 0){
                TreeNode temp = q.poll(); 
                if(temp.left!=null){
                    q.add(temp.left);
                } 
                if(temp.right!=null){
                    q.add(temp.right);
                }
                size--;
                if(size == 0) res.add(temp.val);

            } 
        }

        return res;
    }

}
