package com.lzh.linked;

import com.lzh.model.ListNode;

/******************************************************
 * @Date: 2021-03-23
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L203removeElements {
    /**
     * 头节点和非头节点单独考虑
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return head;
        }
        ListNode pre = head;

        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }

        return head;
    }

    /**
     * 添加一个虚拟头节点
     */

    public ListNode removeElements2(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode tmpHead = new ListNode(val - 1);
        tmpHead.next = head;
        //从虚拟的头节点开始
        ListNode pre = tmpHead;
        while (pre.next != null) {
            if (pre.next.val == val) {
                //只删除节点，当前节点不移动
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return tmpHead.next;
    }
}
