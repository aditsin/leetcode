package com.practice.leetcode.easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *<p>
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *<p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix amongst the input strings.
 */
public class LongestCommonPrefix {

    public static String solution1(String [] str) {

        StringBuilder ans = new StringBuilder();

        for(int i=0; i<str[0].length(); i++) {
            char temp = str[0].charAt(i);

            for(int j=1; j<str.length; j++) {

                if(i >= str[i].length()) {
                    return ans.toString();
                }
                if(temp != str[j].charAt(i)) {
                    return ans.toString();
                }
            }
            ans.append(temp);
        }
        return ans.toString();
    }

    public static String solution2(String [] str) {

        if(str.length == 0) {
            return "";
        }
        StringBuilder ans = new StringBuilder(str[0]);

        for(int i=1; i<str.length; i++) {

            while(str[i].indexOf(ans.toString()) != 0) {
                ans.deleteCharAt(ans.length()-1);
            }
        }
        return ans.toString();
    }
}
