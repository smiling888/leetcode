package com.lzh.binarytree;

import com.lzh.model.TreeNode;

/******************************************************
 * @Date: 2021-02-09
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L543diameterOfBinaryTree {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        return maxDep(root);
    }

    public int maxDep(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int leftdept = treeNode.left == null ? 0 : maxDep(treeNode.left) + 1;
        int rightdept = treeNode.right == null ? 0 : maxDep(treeNode.right) + 1;
        max = Math.max(max, leftdept + rightdept);

        return leftdept > rightdept ? leftdept : rightdept;
    }
}
