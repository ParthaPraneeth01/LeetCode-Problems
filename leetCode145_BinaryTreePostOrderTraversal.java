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
    List<Integer> list=new ArrayList<>();
    void postorder(TreeNode T){
        if(T!=null){
            postorder(T.left);
            postorder(T.right);
            list.add(T.val);
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return list;
    }
}
