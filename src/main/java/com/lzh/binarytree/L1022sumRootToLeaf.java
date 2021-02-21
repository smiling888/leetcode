package com.lzh.binarytree;

import com.lzh.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/******************************************************
 * @Date: 2021-02-21
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L1022sumRootToLeaf {
    int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return sum;
        }
        dep(root, 0);
        return sum;
    }

    /**
     * @param node 当前节点，
     * @param data 当前节点的上面节点累加和
     */
    private void dep(TreeNode node, int data) {

        data = data * 2 + node.val;
        if (node.left == null && node.right == null) {
            sum += data;
            return;
        }
        if (node.left != null) {
            dep(node.left, data);
        }
        if (node.right != null) {
            dep(node.right, data);
        }
    }
}
