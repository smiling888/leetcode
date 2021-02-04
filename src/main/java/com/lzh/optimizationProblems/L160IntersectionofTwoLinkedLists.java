/******************************************************
 * Copyright (C) 2018 iQIYI.COM - All Rights Reserved
 *
 * This file is part of qisheng
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential
 *
 * @Date: 2019/6/11
 * @Author: lzh <liaozhenhua@qiyi.com>
 * ******************************************************/
package com.lzh.optimizationProblems;

import com.lzh.model.ListNode;

/**
 * 求两个链表的交点
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 */
public class L160IntersectionofTwoLinkedLists {
    /**
     * 双指针法 假设a 比b长，b先叨叨最后一个节点，此时将b连接到a头不
     * ，继续向后便利，a再到尾部后，再链接到b。
     * 此时弱有焦点，持续走下去就能找到交接点。
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        boolean change = false;
        while (a != b) {
            if ((a = a.next) == null) {
                if (change) {
                    return null;
                }
                a = headB;
                change = true;
            }
            b = b.next == null ? headA : b.next;
        }
        return a;
    }
}
