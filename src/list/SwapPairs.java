package org.oooooomy.list;

/**
 * 24. 两两交换链表中的节点
 */
public class SwapPairs {

    public static void main(String[] args) {
        ListNode head = ListNode.create(new int[]{1, 2, 3, 4});
        new SwapPairs().swapPairs(head).print();
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {

            //交换
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = cur.next.next;
            cur.next.next = next;

            //迭代下一个节点
            cur = cur.next.next;
        }
        return dummy.next;
    }

}
