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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> node = new LinkedList<>();
        node.add(root);
        int result = root.val;
        while(node.size() >0){
            root = node.poll();
            if (root.right != null){
                node.add(root.right);
            }
            if (root.left != null)
                node.add(root.left);

            result = root.val;
        }
        return result;
    }
}
