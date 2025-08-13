package org.oooooomy.list;

/**
 * 234. 回文链表
 */
public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome(ListNode.create(new int[]{1, 2, 2, 1})));
    }

    //O(n)
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode p = head;
        while (p != null) {
            len++;
            p = p.next;
        }
        p = head;
        ListNode pre = null;
        for (int i = 0; i < len / 2; i++) {
            ListNode temp = p.next;
            p.next = pre;
            pre = p;
            p = temp;
        }
        if (len % 2 != 0) {
            p = p.next;
        }
        while (p != null && pre != null) {
            if (p.val != pre.val) {
                return false;
            }
            p = p.next;
            pre = pre.next;
        }
        return true;
    }

}
