package com.practice.leetcode.easy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Roman2IntegerTest {

    @DataProvider
    public Object[][] testData() {
        return new Object[][] {
                {"III", 3},
                {"IV", 4},
                {"CXL", 140},
                {"MCMXCIV", 1994}
        };
    }

    @Test(dataProvider = "testData")
    public void testSolution(String roman, int ans) {
        assertEquals(ans, Roman2Integer.solution(roman));
    }
}