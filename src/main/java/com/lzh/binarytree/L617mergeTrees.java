package com.lzh.binarytree;

import com.lzh.model.TreeNode;

/******************************************************
 * @Date: 2021-02-10
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L617mergeTrees {
    /**
     * 方法一，使用现有的节点 空间复杂度o（1）
     *
     * @param root1
     * @param root2
     * @return
     */
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 != null) {
            root1 = root2;
            return root1;
        } else if (root1 == null && root2 == null) {
            return null;
        } else if (root1 != null && root2 != null) {
            deep(root1, root2);

        }

        return root1;
    }

    /**
     * 使用深度遍历递归的方式，只有两个 left或者right都不为空菜往下递归。
     *
     * @param root1
     * @param root2
     */

    private void deep(TreeNode root1, TreeNode root2) {
        //deep入口的两个参数不能为null
        root1.val = root1.val + root2.val;
        if (root1.left == null) {
            root1.left = root2.left;
            root2.left = null;
        } else if (root1.left != null && root2.left != null) {
            deep(root1.left, root2.left);

        }
        if (root1.right == null) {
            root1.right = root2.right;
            root2.right = null;
        } else if (root1.right != null && root2.right != null) {
            deep(root1.right, root2.right);
        }

    }

    /**
     * 官方题解，合并时 创建新的节点
     *
     * @param root1
     * @param root2
     * @return
     */
    public TreeNode mergeTrees2(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        TreeNode node = new TreeNode(root1.val + root2.val);
        node.left = mergeTrees2(root1.left, root2.left);
        node.right = mergeTrees2(root1.right, root2.right);
        return node;

    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(3);
        TreeNode r2R = new TreeNode(7);
        root2.right = r2R;
        new L617mergeTrees().mergeTrees(root1, root2);
    }

}
