class Solution {
    public static int helpher(TreeNode root){
        List<Integer>l=new LinkedList<>();
        if(root==null)return 0;
        int ans=0;
         if (root.left != null && root.left.left == null && root.left.right == null) {ans+=root.left.val;}
        ans+=helpher(root.left);
        ans+=helpher(root.right);
        return ans;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        return helpher(root);
    }
}