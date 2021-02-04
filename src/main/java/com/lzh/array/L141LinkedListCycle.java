/******************************************************
 * Copyright (C) 2018 iQIYI.COM - All Rights Reserved
 *
 * This file is part of qisheng
 * Unauthorized copy of this file, via any medium is strictly prohibited.
 * Proprietary and Confidential
 *
 * @Date: 2019/6/13
 * @Author: lzh <liaozhenhua@qiyi.com>
 * ******************************************************/
package com.lzh.array;

import com.lzh.model.ListNode;

import java.util.HashMap;
import java.util.Map;

public class L141LinkedListCycle {
    /**
     * 1. 链表是不是有环 使用快慢指针 O(1)的空间复杂度
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next.next;
        ListNode slow = head;
        boolean hasCycle = false;
        while (fast != null) {
            if (fast == slow) {
                hasCycle = true;
                break;
            }
            slow = slow.next;
            fast = fast.next;
            if (fast == null) {
                break;
            }
            fast = fast.next;
        }
        return hasCycle;
    }

    /**
     *  使用hashmap。时间复杂度和空间复杂度 都是O(n)
     *
     * @param head
     * @return
     */

    public ListNode findCylePoint(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
        while (head != null) {
            if (map.put(head, head.val) != null) {
                return head;
            }
            head = head.next;
        }
        return null;
    }

//            3.如果存在环，求出环上节点的个数；
//
//            4.如果存在环，求出链表的长度；
//
//            5.如果存在环，求出环上距离任意一个节点最远的点（对面节点）；
//
//            6.（扩展）如何判断两个无环链表是否相交；
//
//            7.（扩展）如果相交，求出第一个相交的节点；


}
