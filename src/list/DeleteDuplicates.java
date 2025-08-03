package org.oooooomy.list;

/**
 * 83. 删除排序链表中的重复元素
 */
public class DeleteDuplicates {

    public static void main(String[] args) {
//        ListNode node = ListNode.create(new int[]{1, 1, 2, 3, 3});
        ListNode node = ListNode.create(new int[]{1, 1, 2});
        ListNode h = new DeleteDuplicates().deleteDuplicates(node);
        h.print();
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode p = head;
        while (p.next != null) {
            if (p.val == p.next.val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }

}
