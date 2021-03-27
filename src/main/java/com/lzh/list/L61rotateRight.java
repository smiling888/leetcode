package com.lzh.list;

import com.lzh.model.ListNode;

/**
 * @author jiuxing.lzh
 * Date: 2021/3/27
 **/
public class L61rotateRight {
    /**
     * https://leetcode-cn.com/problems/rotate-list/
     * 链表旋转
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int count = 1;
        //找到最后一个节点，同时计算节点总数
        ListNode last = head;
        while (last.next != null) {
            count++;
            last = last.next;
        }

        int step = count - k % count;
        ListNode kNode = head;
        count = 1;
        while (count != step) {
            count++;
            kNode = kNode.next;
        }
        last.next = head;
        head = kNode.next;
        kNode.next = null;
        return head;

    }
}
