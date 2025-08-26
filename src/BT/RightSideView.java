package org.oooooomy.BT;

import java.util.ArrayList;
import java.util.List;

public class RightSideView {

    List<Integer> res = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        proc(root, 0);
        return res;
    }

    public void proc(TreeNode root, int deep) {
        if (root == null) {
            return;
        }
        if (deep == res.size()) {
            res.add(root.val);
        }
        proc(root.right, deep + 1);
        proc(root.left, deep + 1);
    }

}
