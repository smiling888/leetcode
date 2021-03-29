package com.lzh.array.twosum;

import com.lzh.model.TreeNode;

/******************************************************
 * @Date: 2021-03-30
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L653findTarget {

    public boolean findTarget(TreeNode root, int k) {
        //遍历数据
        return bianli(root, root, k);
    }

    public boolean bianli(TreeNode tmproot, TreeNode root, int k) {

        if (tmproot == null) {
            return false;
        }
        int target = k - tmproot.val;
        boolean find = findSub(tmproot, root, target);
        if (find) {
            return true;
        }

        find = bianli(tmproot.left, root, k);
        if (find) {
            return true;
        }
        find = bianli(tmproot.right, root, k);
        return find;

    }

    boolean findSub(TreeNode cur, TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        //需要判断当前
        if (cur != root && root.val == target) {
            return true;
        } else if (root.val < target) {
            return findSub(cur, root.right, target);
        } else {
            return findSub(cur, root.left, target);
        }
    }


}
