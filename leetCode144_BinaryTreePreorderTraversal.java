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
    List<Integer> list = new ArrayList<>();
    void preorder(TreeNode T){
        if(T!=null){
            list.add(T.val);
            preorder(T.left);
            preorder(T.right);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return list;
    }
}
