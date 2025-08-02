package org.oooooomy.list;

/**
 * 19. 删除链表的倒数第 N 个结点
 */
public class RemoveNthFromEnd {

    public static void main(String[] args) {
        ListNode node = ListNode.create(new int[]{1, 4, 3, 2, 5, 2});
        node.print();
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = dummy;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }

    //错误 这种只适合长度大于3,且n不是边界
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode p = head;
//        int count = 0;
//        while (p != null) {
//            count++;
//            p = p.next;
//        }
//        //delete: index = count - n
//        p = head;
//        for (int i = 0; i < count - n - 1; i++) {
//            p = p.next;
//        }
//        p.next = p.next.next;
//        return head;
//    }

//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode p1 = head; //头节点
//        ListNode p2 = head; //尾节点
//        int left = 0, right = 0;
//        while (p2 != null) {
//            if (right - left == n) { //不需要right-left=n,只需要current=n是，left在移动即可，不用维护两个index
//                right++;
//                p1 = p1.next;
//            }
//            p2 = p2.next;
//            left++;
//        }
//
//        return head;
//    }

}
