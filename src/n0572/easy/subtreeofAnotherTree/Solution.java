package n0572.easy.subtreeofAnotherTree;

public class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (root == null) {
            return false;
        } else if (isSameTree(root, subRoot)) {
            return true;
        } else {
            return isSubtree(subRoot.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    public boolean isSameTree(TreeNode root, TreeNode subTree) {
        if (root == null || subTree == null) {
            return root == null && subTree == null;
        } else if (root.val == subTree.val) {
            return isSameTree(root.left, subTree.left) && isSameTree(root.right, subTree.right);
        } else {
            return false;
        }
    }

}
