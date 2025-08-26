package org.oooooomy.list;

public class ReverseKGroup {

    //每一轮要遍历是否是k的倍数，n % k != 0 退出，原链表保持不变
    public ListNode reverseKGroup(ListNode head, int k) {
        int n = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            n++;
        }

        ListNode dummy = new ListNode();
        ListNode cur = head;
        ListNode pre = null;

        for (; n >= k; n -= k) {
            //k个一组反转
            for (int i = 0; i < k; i++) {
                ListNode next = cur.next;
                next.next = cur;
                cur = next;
            }
        }

        return null;
    }

}
