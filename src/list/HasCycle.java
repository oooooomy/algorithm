package org.oooooomy.list;

/**
 * 141. 环形链表
 */
public class HasCycle {

    //只有一个next，所以一定是最后一个节点指向前边的某个节点
    //怎么判断某个节点出现过？
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

}
