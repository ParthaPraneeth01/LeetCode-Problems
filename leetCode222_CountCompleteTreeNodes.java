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
    int count=0;
    void count(TreeNode T){
        if(T!=null){
            count(T.left);
            count++;
            count(T.right);
        }
    }
    public int countNodes(TreeNode root) {
        count(root);
        return count;
    }
}
