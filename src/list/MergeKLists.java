package org.oooooomy.list;

import java.util.*;

/**
 * 23. 合并 K 个升序链表
 */
public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode dummy = new ListNode(0);
        ListNode p = dummy;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        while (!pq.isEmpty()) {
            ListNode poll = pq.poll();
            if (poll.next != null) {
                pq.offer(poll.next);
            }
            p.next = poll;
            p = p.next;
        }

        return dummy.next;
    }

}
