package com.practice.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {

    public static int solution(String roman) {
        Map<Character, Integer> mapping = new HashMap<>();
        mapping.put('I', 1);
        mapping.put('V', 5);
        mapping.put('X', 10);
        mapping.put('L', 50);
        mapping.put('C', 100);
        mapping.put('D', 500);
        mapping.put('M', 1000);

        int ans = 0;

        for(int i=0;i<roman.length();i++) {
            char atI = roman.charAt(i);
            if(i<roman.length()-1 && (mapping.get(atI)<mapping.get(roman.charAt(i+1)))) {
                ans += (mapping.get(roman.charAt(i+1)) - mapping.get(atI));
                i++;
            } else {
                ans += mapping.get(atI);
            }
        }
        return ans;
    }
}
