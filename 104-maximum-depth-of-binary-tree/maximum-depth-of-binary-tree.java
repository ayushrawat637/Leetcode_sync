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
    public int maxDepth(TreeNode root) {
        int ldepth =0,rdepth =0;
        if(root==null)  return 0;
        ldepth = maxDepth(root.left);
        rdepth = maxDepth(root.right);
        return 1+Math.max(ldepth,rdepth);
    }
}