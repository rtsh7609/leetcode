class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public int maxDepth(TreeNode root) {
        return treeHeight(root);
    }

    private int treeHeight(TreeNode node) {
        if (node == null) return 0; // Base case: if node is null, return 0

        int leftHeight = treeHeight(node.left);   // Get height of left subtree
        int rightHeight = treeHeight(node.right); // Get height of right subtree

        return 1 + Math.max(leftHeight, rightHeight); // Height of current node
    }
}