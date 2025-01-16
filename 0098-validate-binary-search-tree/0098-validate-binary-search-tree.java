public class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private boolean validate(TreeNode node, Integer minVal, Integer maxVal) {
        if (node == null) return true;

        // Check current node's value against the valid range
        if ((minVal != null && node.val <= minVal) || 
            (maxVal != null && node.val >= maxVal)) {
            return false;
        }

        // Recursively validate left and right subtrees
        return validate(node.left, minVal, node.val) && 
               validate(node.right, node.val, maxVal);
    }
}