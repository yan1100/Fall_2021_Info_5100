package com.company;

import java.util.Arrays;

public class Q3MoveZeroes {
    public static void main(String[] args) {
        Q3MoveZeroes mz = new Q3MoveZeroes();

        int[] nums1 = {0,1,0,3,12};
        System.out.println("Input: " + Arrays.toString(nums1));
        mz.moveZeroes(nums1);
        System.out.println("Output: " + Arrays.toString(nums1));

        int[] nums2 = {0};
        System.out.println("\nInput: " + Arrays.toString(nums2));
        mz.moveZeroes(nums2);
        System.out.println("Output: " + Arrays.toString(nums2));

        int[] nums3 = {0,7,0,8,0,9};
        System.out.println("\nInput: " + Arrays.toString(nums3));
        mz.moveZeroes(nums3);
        System.out.println("Output: " + Arrays.toString(nums3));

        int[] nums4 = {1,2,1,2};
        System.out.println("\nInput: " + Arrays.toString(nums4));
        mz.moveZeroes(nums4);
        System.out.println("Output: " + Arrays.toString(nums4));

    }

    //Time Complexity:O(n)
    //Space Complexity:O(1)
    public void moveZeroes(int[] nums) {
        int firstZero = -1;
        for (int i = 0; i < nums.length; i++) {
            if (firstZero == -1){
                if (nums[i] == 0){
                    firstZero = i;
                }
            }else if (nums[i] != 0){
                nums[firstZero] = nums[i];
                nums[i] = 0;
                firstZero++;
            }
        }
    }
}
