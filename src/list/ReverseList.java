package org.oooooomy.list;

/**
 * 206. 反转链表
 */
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode n = cur.next;
            cur.next = pre;
            pre = cur;
            cur = n;
        }
        return pre;
    }

}
