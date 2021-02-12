package com.lzh.list;

import com.lzh.model.ListNode;

/******************************************************
 * @Date: 2021-02-12
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L19removeNthFromEnd {
    /**
     * 遍历两次，先计算节点总数，再计算删除节点位置。注意删除头节点特殊情况
     *
     * @param head
     * @param n
     * @return
     */

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            size++;
        }
        //移除的是头节点时，这里需要注意。
        if (n == size) {
            return head.next;
        }
        int index = size - n;
        node = head;
        while (index-- != 1) {
            node = node.next;
        }

        if (node.next != null) {
            node.next = node.next.next;
        }
        return head;

    }

    /**
     * 快慢指针
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode fast = head, slow = head;
        while (n != 0) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;

            n--;
        }
        do {
            //删除头节点时 fast为null
            if(fast==null){
                return head.next;
            }
            if (fast.next == null) {
                slow.next = slow.next.next;
                break;
            }
            fast = fast.next;
            slow = slow.next;

        } while (fast != null);
        return head;

    }

    //

    public static void main(String[] args) {
        ListNode head = getList(new int[]{1, 2, 3, 4, 5});
        removeNthFromEnd(head, 2);
    }


    public static ListNode getList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode node = head;
        for (int i = 1; i < arr.length; i++) {
            node.next = new ListNode(arr[i]);
            node = node.next;

        }
        return head;
    }
}
