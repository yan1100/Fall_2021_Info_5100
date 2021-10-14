package com.company;

public class Q8ValidPalindrome {
    public static void main(String[] args) {
        Q8ValidPalindrome vp = new Q8ValidPalindrome();

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(vp.isPalindrome(s1));//output: true

        String s2 = "race a car";
        System.out.println(vp.isPalindrome(s2));//output: false

        String s3 = "8A";
        System.out.println(vp.isPalindrome(s3));//output: false

    }

    //Time Complexity:O(n)
    //Space Complexity:O(1)
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        s = s.toLowerCase();

        while (start < end) {
            if (Character.isLetterOrDigit(s.charAt(start)) && Character.isLetterOrDigit(s.charAt(end))){
                if (s.charAt(start) == s.charAt(end)){
                    start++;
                    end--;
                }else {
                    return false;
                }
            }else {
                if (!Character.isLetterOrDigit(s.charAt(start))) {
                    start++;
                }
                if (!Character.isLetterOrDigit(s.charAt(end))) {
                    end--;
                }
            }
        }
        return true;
    }
}
