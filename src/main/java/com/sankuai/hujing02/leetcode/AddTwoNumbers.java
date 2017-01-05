package com.sankuai.hujing02.leetcode;

/**
 * Created by IntelliJ IDE.
 * User: hujing02
 * Time: 2016/12/12 下午4:55
 * Description:
     You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

     Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     Output: 7 -> 0 -> 8


 */

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        int carry = 0;
        while (l1 != null && l2 != null) {
            current = new ListNode(0);
            int value = l1.val + l2.val + carry;
            if (value > 9) {
                carry = 1;
                value -= 10;
            }
            current.val = value;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            int value = l1.val + carry;

        } else {
            int value = l2.val + carry;
        }


        return result;
    }

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

}
