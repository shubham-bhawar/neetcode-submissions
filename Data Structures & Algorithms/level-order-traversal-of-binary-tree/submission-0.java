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
        
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            // List<Integer> res = new ArrayList<>();
            //  ans.add(res);
             return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> res = new ArrayList<>();
            for(int i = 0 ;i<size;i++){
                TreeNode temp = q.remove();
                res.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }

            }
            ans.add(res);
        }
        return ans;
    }
}
