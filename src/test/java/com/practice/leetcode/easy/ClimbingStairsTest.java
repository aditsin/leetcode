package com.practice.leetcode.easy;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class ClimbingStairsTest {

    @DataProvider
    public Object[][] testData() {
        return new Object[][] {
                {1, 1},
                {2, 2},
                {3, 3},
                {4, 5},
                {5, 8},
                {44, 1134903170}
        };
    }

    @Test(dataProvider = "testData")
    public void testClimbingStairsBruteForce(int n, int ans) {
        long t1 = System.currentTimeMillis();
        Assert.assertEquals(ClimbingStairs.climbingStairsBruteForce(n), ans);
        long t2 = System.currentTimeMillis();
        long t3 = t2-t1;
        System.out.println("[BRUTE FORCE]Time for " + n + ": " + t3);
    }

    @Test(dataProvider = "testData")
    public void testClimbingStairsMemoization(int n, int ans) {
        long t1 = System.currentTimeMillis();
        Assert.assertEquals(ClimbingStairs.climbingStairsMemoization(n), ans);
        long t2 = System.currentTimeMillis();
        long t3 = t2-t1;
        System.out.println("[MEM]Time for " + n + ": " + t3);
    }

    @Test(dataProvider = "testData")
    public void testClimbingStairsDP(int n, int ans) {
        long t1 = System.currentTimeMillis();
        Assert.assertEquals(ClimbingStairs.climbingStairsDP(n), ans);
        long t2 = System.currentTimeMillis();
        long t3 = t2-t1;
        System.out.println("[DP]Time for " + n + ": " + t3);
    }

    @Test(dataProvider = "testData")
    public void testClimbingStairsOptimized(int n, int ans) {
        long t1 = System.currentTimeMillis();
        Assert.assertEquals(ClimbingStairs.climbingStairsOptimized(n), ans);
        long t2 = System.currentTimeMillis();
        long t3 = t2-t1;
        System.out.println("[OPTIMIZED]Time for " + n + ": " + t3);
    }
}