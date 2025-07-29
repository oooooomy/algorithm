package org.oooooomy.list;

/**
 * 86. 分隔链表
 */
public class Partition {

    public static void main(String[] args) {
        ListNode node = ListNode.create(new int[]{1, 4, 3, 2, 5, 2});
        node.print();
        ListNode partition = partition(node, 3);
        partition.print();
    }

    public static ListNode partition(ListNode head, int x) {
        ListNode p = head;
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode h1 = dummy1;
        ListNode h2 = dummy2;
        while (p != null) {
            if (p.val < x) {
                h1.next = p;
                h1 = h1.next;
            } else {
                h2.next = p;
                h2 = h2.next;
            }
            p = p.next;
        }
        h1.next = dummy2.next;
        return dummy1.next;
    }

}
