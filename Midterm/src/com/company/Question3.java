package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Question3 {
    public static void main(String[] args) {
        //test
        int[] nums1 = new int[]{1,3,-1,3,4,-1};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + sumOfRepeatedNumbers(nums1));
    }
    public static int sumOfRepeatedNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) != 1) {
                sum += key;
            }
        }
        return sum;
    }
}
