package com.practice.leetcode.easy;

import com.practice.leetcode.model.ListNode;

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 *
 * Given: 1 -> 1 -> 2 result: 1 -> 2
 */

public class RemoveDuplicateLL {

    public static ListNode removeDuplicates(ListNode head) {
        ListNode itr = head;

        while(itr != null && itr.next != null) {
            if(itr.val == itr.next.val) {
                ListNode temp = itr;
                while(itr.next != null && itr.val == itr.next.val) {
                    itr = itr.next;
                }
                itr = itr.next;
                temp.next = itr;
            } else {
                itr = itr.next;
            }
        }
        return head;
    }
}
