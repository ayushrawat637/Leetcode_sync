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
    void path(TreeNode root, String path, ArrayList<String> list) {
        if(root==null)  return;
        path=path+root.val;
        if(root.left==null && root.right==null) {
            list.add(path);
            return;
        }
        path=path+"->";
        path(root.left, path, list);
        path(root.right, path, list);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String>list = new ArrayList<>();
        path(root, "", list);
        return list;
    }
}