package org.oooooomy.list;

/**
 * 1669. 合并两个链表
 */
public class MergeInBetween {

    public static void main(String[] args) {
        ListNode node1 = ListNode.create(new int[]{0, 1, 2, 3, 4, 5, 6});
        ListNode node2 = ListNode.create(new int[]{1000000, 1000001, 1000002, 1000003, 1000004});
        ListNode merged = new MergeInBetween().mergeInBetween(node1, 2, 5, node2);
        merged.print();
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode left = null;

        for (int i = 0; i < b; i++) {
            if (i == a - 1) {
                left = p1;
            }
            p1 = p1.next;
        }

        left.print();
        p1.print();

        left.next = list2;
        while (p2.next != null) {
            p2 = p2.next;
        }
        p2.next = p1.next;

        return list1;
    }

}
