package com.lzh.list;

import com.lzh.model.ListNode;

/******************************************************
 * @Date: 2021-02-08
 * @Author: lzh <lzhhua110@126.com>
 * ******************************************************/
public class L234isPalindrome {
    /**
     * 先反转整个连表，再一一对比。空间复杂度 O（n）
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode newNode = null, tmpHead = head;

        while (tmpHead != null) {
            ListNode tmpNode = new ListNode(tmpHead.val);
            tmpNode.next = newNode;
            newNode = tmpNode;
            tmpHead=tmpHead.next;
        }


        while (head != null) {
            if (head.val != newNode.val) {
                return false;
            }
            head=head.next;
            newNode=newNode.next;

        }

        return true;

    }


}
