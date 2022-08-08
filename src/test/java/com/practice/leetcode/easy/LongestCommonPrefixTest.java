package com.practice.leetcode.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LongestCommonPrefixTest {

    @DataProvider
    public Object[][] testData() {
        return new Object[][] {
                {new String[]{"dog", "cat", "none"}, ""},
                {new String[]{"", "cat", "cate"}, ""},
                {new String[]{"dog", "dog", "dog"}, "dog"},
                {new String[]{"flow", "flower", "flint"}, "fl"}
        };
    }

    @Test(dataProvider = "testData")
    public void testSolution(String [] str, String ans) {
        Assert.assertEquals(LongestCommonPrefix.solution1(str), ans);
        Assert.assertEquals(LongestCommonPrefix.solution2(str), ans);
    }
}