package com.practice.leetcode.easy;

import com.practice.leetcode.model.ListNode;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RemoveDuplicateLLTest {

    @DataProvider
    public Object[][] testData() {
        return new Object[][] {
                {new int[]{1, 1, 2}, new int[]{1,2}},
                {new int[]{1,2,2,3,3}, new int[]{1,2,3}},
                {new int[]{2,3,4,4,4,4,5,5,7,7,7,8,8,8}, new int[]{2,3,4,5,7,8}}
        };
    }

    @Test(dataProvider = "testData")
    public void testRemoveDuplicates(int [] LLVals, int [] ans) {
        ListNode head = new ListNode(LLVals[0]);
        ListNode itr  = head;
        for(int i = 1; i<LLVals.length; i++) {
            itr.next = new ListNode(LLVals[i]);
            itr = itr.next;
        }
        ListNode ansHead = RemoveDuplicateLL.removeDuplicates(head);

        for(int i = 0; i<ans.length; i++) {
            Assert.assertEquals(ansHead.val, ans[i]);
            ansHead = ansHead.next;
        }
        Assert.assertNull(ansHead);
    }
}