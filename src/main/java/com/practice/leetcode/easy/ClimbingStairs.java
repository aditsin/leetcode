package com.practice.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 *
 * Example 2:
 *
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class ClimbingStairs {

    /**
     * Hint: This question basically requires to calculate fibonacci number for n
     */


    /**
     * Brute force solution
     * Time: O(2^n)
     * Space: O(n)
     */
    public static int climbingStairsBruteForce(int n) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }

        return climbingStairsBruteForce(n-1) + climbingStairsBruteForce(n-2);
    }

    /**
     * Recursion with Memoization (Storing previously calculated values). Top down approach
     * Time: O(n) we are calculating the ans for all values <= n
     * Space: O(n)
     */
    public static int climbingStairsMemoization(int n) {
        Map<Integer, Integer> mem = new HashMap<>();
        mem.put(1, 1);
        mem.put(2, 2);
        return fib(n, mem);
    }

    static int fib(int n, Map<Integer, Integer> mem) {
        if(mem.containsKey(n)) {
            return mem.get(n);
        }

        mem.put(n, (fib(n-1, mem) + fib(n-2, mem)));
        return mem.get(n);
    }

    /**
     * DP. Bottom approach
     * Time: O(n)
     * Space: O(n)
     */
    public static int climbingStairsDP(int n) {
        if(n == 0 || n == 1 || n == 2) {
            return n;
        }

        int [] dpArray = new int[n+1];
        dpArray[0] = 0;
        dpArray[1] = 1;
        dpArray[2] = 2;

        for(int i = 3; i <= n; i++) {
            dpArray[i] = dpArray[i-1] + dpArray[i-2];
        }

        return dpArray[n];
    }

    /**
     * Most optimized
     * Time: O(n)
     * Space: O(1)
     */
    public static int climbingStairsOptimized(int n) {
        if(n == 0 || n == 1 || n == 2) {
            return n;
        }

        int prevToPrev = 1;
        int prev = 2;

        int ans = 0;

        for(int i = 3; i <= n; i++) {
            ans = prev + prevToPrev;
            prevToPrev = prev;
            prev = ans;
        }

        return ans;
    }

}
