package com.lzh.linked;

import com.lzh.model.ListNode;

/******************************************************
 * @Date: 2019-08-06
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class ReverseList {
    /**
     * @param node
     * @return
     */
    public static ListNode reverseList(ListNode node) {
        ListNode pre = null;

        while (node != null) {

            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }

    // 更加简单的方法是创建一个新的链接，将反转的连表保存到新的连表厘面
}
