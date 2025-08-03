package org.oooooomy.list;

/**
 * 82. 删除排序链表中的重复元素 II
 */
public class DeleteDuplicates2 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode p = dummy;

        //因为有一个虚拟头节点所以只有一个节点时p.next.next==null，不进入循环，且一个头节点一定不存在重复
        //判断重复至少要保证两个节点才能判断！所以需要p.next != null && p.next.next != null
        //并且p.next p.next.next作为循环条件，这样p作为前驱节点可以删除重复节点
        while (p.next != null && p.next.next != null) {
            int val = p.next.val;
            if (val == p.next.next.val) {
                //循环向后删除与val相同的节点，直到出现不同的值
                while (p.next != null && p.next.val == val) {
                    //删除重复节点
                    p.next = p.next.next;
                }
            }
            //如果不同向后移动节点
            else {
                p = p.next;
            }
        }

        return dummy.next;
    }

//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null) {
//            return null;
//        }
//        ListNode dummy = new ListNode(999, head);
//        ListNode left = dummy;
//        ListNode right = head;
//        int current = head.val;
//        while (right != null) {
//            if (right.val == current) {
//                while (right.val != current) {
//
//                    right = right.next;
//                }
//            } else {
//
//            }
//            right = right.next;
//        }
//        return dummy.next;
//    }

}
