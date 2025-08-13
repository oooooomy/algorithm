package org.oooooomy.list;

/**
 * 86. 分隔链表
 */
public class Partition {

    /**
     * 错误做法
     */
//    public ListNode partition(ListNode head, int x) {
//        ListNode p = head;
//        ListNode dummy1 = new ListNode();
//        ListNode dummy2 = new ListNode();
//        ListNode h1 = dummy1;
//        ListNode h2 = dummy2;
//        while (p != null) {
//            if (p.val < x) {
//                h1.next = p; //这里的p没有和原节点断开，最后会形成环
//                h1 = h1.next;
//            } else {
//                h2.next = p;
//                h2 = h2.next;
//            }
//            p = p.next;
//        }
//        h1.next = dummy2.next;
//        return dummy1.next;
//    }

    public ListNode partition(ListNode head, int x) {
        ListNode p = head;
        ListNode dummy1 = new ListNode();
        ListNode dummy2 = new ListNode();
        ListNode h1 = dummy1;
        ListNode h2 = dummy2;
        ListNode next;
        while (p != null) {
            next = p.next;
            p.next = null;
            if (p.val < x) {
                h1.next = p;
                h1 = h1.next;
            } else {
                h2.next = p;
                h2 = h2.next;
            }
            p = next;
        }
        h1.next = dummy2.next;
        return dummy1.next;
    }

}
