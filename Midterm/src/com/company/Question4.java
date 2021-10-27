package com.company;

import java.util.HashMap;
import java.util.Map;

public class Question4 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Input: " + s);
        System.out.println("Output: " + longestSubstring(s));
    }

    public static String longestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int longest = 0;
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            char c= s.charAt(i);
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, i);
            if (i - start + 1 > longest) {
                ans = s.substring(start, i + 1);
            }
            longest = Math.max(longest, i - start + 1);
        }
        return ans;
    }
}
