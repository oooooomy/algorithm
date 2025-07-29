package org.oooooomy.list;

/**
 * 21. 合并两个有序链表
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //1. 新建一个头节点，和两个指针p q，指向两个链表头节点
        //比较q p 的val大小，最后当一个链表遍历完了之后，直接把剩余的另一个链表挂在结果后边
        //循环条件
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        ListNode p = list1, q = list2;
        while (p != null && q != null) {
            if (p.val < q.val) {
                head.next = p;
                p = p.next;
            } else {
                head.next = q;
                q = q.next;
            }
            head = head.next;
        }
        if (p != null) {
            head.next = p;
        }
        if (q != null) {
            head.next = q;
        }
        return dummy.next;
    }

}
