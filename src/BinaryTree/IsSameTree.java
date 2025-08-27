package org.oooooomy.BinaryTree;

/**
 * 100. 相同的树
 */
public class IsSameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
