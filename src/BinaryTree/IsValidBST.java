package org.oooooomy.BinaryTree;

/**
 * 98. 验证二叉搜索树
 */
public class IsValidBST {

    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean valid(TreeNode root, long left, long right) {
        if (root == null) {
            return true;
        }
        long x = root.val;
        return left < x && x < right && valid(root.left, left, x) && valid(root.right, x, right);
    }

}
