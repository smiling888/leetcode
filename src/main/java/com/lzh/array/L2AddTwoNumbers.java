package com.lzh.array;

import com.lzh.model.ListNode;

/******************************************************
 * @Date: 2019-08-06
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = null, fistNode = null;
        int ten = 0;
        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            int result = a + b + ten;
            ten = result / 10;
            result = result % 10;

            if (resultNode == null) {
                resultNode = new ListNode(result);
                fistNode = resultNode;
            } else {
                resultNode.next = new ListNode(result);
                resultNode = resultNode.next;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (ten == 1) {
            resultNode.next = new ListNode(ten);

        }
        return fistNode;
    }
}
