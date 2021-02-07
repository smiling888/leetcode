package com.lzh.binarytree;

import com.lzh.model.TreeNode;

/******************************************************
 * @Date: 2021-02-07
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L226InvertTree {
    //https://leetcode-cn.com/problems/invert-binary-tree/

    //每次翻转当前节点的左右节点即可。

    public TreeNode invertTree2(TreeNode root) {
        if (root == null) {
            return root;
        }

        doIvertTree2(root);
        return root;
    }

    public void doIvertTree2(TreeNode root) {

        if (root == null) {
            return;

        }

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        doIvertTree2(root.left);
        doIvertTree2(root.right);

    }


}
