package com.practice.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {

    public static int[] solution(int [] val, int target) {

        Map<Integer, Integer> valMap = new HashMap<>();
        int [] ans = new int[2];

        for(int i=0;i<val.length;i++) {
            int inverse = target - val[i];

            if(valMap.containsKey(inverse)) {
                ans[0] = valMap.get(inverse);
                ans[1] = i;
                break;
            } else {
                valMap.put(val[i], i);
            }
        }
        return ans;
    }
}
