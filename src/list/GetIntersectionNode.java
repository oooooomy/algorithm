package org.oooooomy.list;

/**
 * 160. 相交链表
 */
public class GetIntersectionNode {

    public static void main(String[] args) {
        ListNode headA = ListNode.create(new int[]{4, 1, 8, 4, 5});
        ListNode headB = ListNode.create(new int[]{5, 6, 1, 8, 4, 5});
        System.out.println(getIntersectionNodeSlow(headA, headB));
    }

    public static ListNode getIntersectionNodeSlow(ListNode headA, ListNode headB) {
        ListNode pA = headA, pB = headB;
        int lenA = 0, lenB = 0;
        while (pA != null) {
            pA = pA.next;
            lenA++;
        }
        while (pB != null) {
            pB = pB.next;
            lenB++;
        }
        pA = headA;
        pB = headB;
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                pA = pA.next;
            }
        } else if (lenA < lenB) {
            for (int i = 0; i < lenB - lenA; i++) {
                pB = pB.next;
            }
        }
        while (pA.next != null && pB.next != null && pA.next.val != pB.next.val) {
            pA = pA.next;
            pB = pB.next;
        }
        return pA;
    }

}
