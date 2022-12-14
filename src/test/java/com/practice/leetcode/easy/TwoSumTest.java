package com.practice.leetcode.easy;

import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoSumTest {

    @DataProvider
    public Object[][] testData() {
        return new Object[][] {
                {new int[]{3,2,4}, 6, new int[]{1,2}},
                {new int[]{-4, 0, 1000, 6}, 2, new int[]{0,3}}
        };
    }

    @Test(dataProvider = "testData")
    public void testSolution(int [] num, int target, int [] ans) {
        assertEquals(ans, TwoSum.solution(num, target));
    }
}