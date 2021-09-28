package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    //Question 1 Test
        System.out.println("=======================================");
        System.out.println("Question 1 Example 1: ");
        int[] nums1 = new int[]{1,2,3,2};
        System.out.print("Input: ");
        printArray(nums1);
        System.out.println("Output: " + sumOfUnique(nums1));

        System.out.println("\nQuestion 1 Example 2: ");
        int[] nums2 = new int[]{1,1,1,1};
        System.out.print("Input: ");
        printArray(nums2);
        System.out.println("Output: " + sumOfUnique(nums2));


        //Question 2 Test
        System.out.println("=======================================");
        System.out.println("Question 2 Example 1: ");
        int[] nums3 = new int[]{-4,-1,0,3,10};
        System.out.print("Input: ");
        printArray(nums3);
        System.out.print("Output: ");
        printArray(sortedSquares(nums3));

        System.out.println("\nQuestion 2 Example 2: ");
        int[] nums4 = new int[]{-7,-3,2,3,11};
        System.out.print("Input: ");
        printArray(nums4);
        System.out.print("Output: ");
        printArray(sortedSquares(nums4));

        //Question 3 Test
        System.out.println("=======================================");
        System.out.println("Question 3 Example 1: ");
        int[] nums5 = new int[]{2,3,4,2,2,3,5,7};
        System.out.print("Input: ");
        printArray(nums5);
        System.out.println("Output: " + firstNonRepeatedNum(nums5));

        System.out.println("\nQuestion 3 Example 2: ");
        int[] nums6 = new int[]{1,1,6,7,9,6,7,4};
        System.out.print("Input: ");
        printArray(nums6);
        System.out.println("Output: " + firstNonRepeatedNum(nums6));

        //Question 4 Test
        System.out.println("=======================================");
        System.out.println("Question 4 Example 1: ");
        String ransomNote1 = "aa";
        String magazine1 = "ab";
        System.out.println("ransomNote = " + ransomNote1 + ", magzine = " + magazine1);
        System.out.println("Output: " + canBeConstructed(ransomNote1,magazine1));

        System.out.println("\nQuestion 4 Example 2: ");
        String ransomNote2 = "aa";
        String magazine2 = "aab";
        System.out.println("ransomNote = " + ransomNote2 + ", magzine = " + magazine2);
        System.out.println("Output: " + canBeConstructed(ransomNote2,magazine2));

        //Question 5 Test
        System.out.println("=======================================");
        System.out.println("Question 5 Example 1: ");
        String str1 = "1A3d4s5t";
        System.out.println("str = " + str1);
        System.out.println("Output: " + letterNumString(str1));

        System.out.println("\nQuestion 5 Example 2: ");
        String str2 = "A2bb2d4";
        System.out.println("str = " + str2);
        System.out.println("Output: " + letterNumString(str2));



    }

    //Question 1
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!count.containsKey(nums[i])){
                count.put(nums[i],1);
                sum += nums[i];
            }else {
                count.put(nums[i],count.get(nums[i]) + 1);
            }
            if (count.get(nums[i]) == 2){
                sum -= nums[i];
            }
        }
        return sum;
    }

    //Question 2
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static int[] sortedSquares(int[]nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] squareArray = new int[nums.length];

        while(left <= right){
            int i = nums[left] * nums[left];
            int j = nums[right] * nums[right];
            if (i >= j){
                squareArray[index] = i;
                left++;
            }else {
                squareArray[index] = j;
                right--;
            }
            index--;
        }
        return squareArray;
    }

    //Question 3
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static int firstNonRepeatedNum (int[]nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }
        for (int i = 0; i < nums.length; i++){
            if (count.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
    }

    //Question 4
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public static boolean canBeConstructed(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()){
            return false;
        }
        int[] letterCount = new int[26];
        for (int i = 0; i < magazine.length(); i++){
            letterCount[magazine.charAt(i)-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++){
            letterCount[ransomNote.charAt(i)-'a']--;
        }
        for (int i : letterCount) {
            if (i < 0){
                return false;
            }
        }
        return true;
    }

    //Question 5
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public static boolean letterNumString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (Character.isDigit(s.charAt(i))) {
                if (!Character.isLetter(s.charAt(i + 1))) {
                    return false;
                }
            } else if (Character.isLetter(s.charAt(i))) {
                if (!Character.isDigit(s.charAt(i + 1))) {
                    return false;
                }
            }
        }
        return true;
    }


    //Others
    public static void printArray(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++){
            System.out.print(nums[i] + ",");
        }
        System.out.println(nums[nums.length-1] + "]");
    }

}
