/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
    
        return getMaxDepth(root);        
    }
    
    int getMaxDepth(TreeNode node)
    {
        if(node == null) return 0;
        
        if(node.left == null && node.right == null)
            return 1;
        
        return Math.max(getMaxDepth(node.left), getMaxDepth(node.right)) + 1;
    }
}
