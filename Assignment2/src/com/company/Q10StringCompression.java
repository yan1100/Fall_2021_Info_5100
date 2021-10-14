package com.company;

import java.util.Arrays;

public class Q10StringCompression {
    public static void main(String[] args) {
        Q10StringCompression sc = new Q10StringCompression();
        char[] chars1 = new char[]{'a','a','b','b','c','c','c'};
        System.out.println("Input:" + Arrays.toString(chars1));
        System.out.println("Output: " + sc.compress(chars1));
        //Output: 6 -> {a,2,b,2,c,3}

        char[] chars2 = new char[]{'a'};
        System.out.println("\nInput:" + Arrays.toString(chars2));
        System.out.println("Output: " + sc.compress(chars2));
        //Output: 1 -> {a}

        char[] chars3 = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println("\nInput:" + Arrays.toString(chars3));
        System.out.println("Output: " + sc.compress(chars3));
        //Output: 4 -> {a,b,1,2}

        char[] chars4 = new char[]{'a','a','a','b','b','a','a'};
        System.out.println("\nInput:" + Arrays.toString(chars4));
        System.out.println("Output: " + sc.compress(chars4));
        //Output: 6 -> {a,3,b,2,a,2}

    }

    //Time Complexity:O(n)
    //Space Complexity: O(1)
    public int compress(char[] chars) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            count++;
            if (i == chars.length - 1 || chars[i] != chars[i + 1]) {
                chars[index++] = chars[i];
                if (count > 1) {
                    String countString = "" + count;
                    for (int j = 0; j < countString.length(); j++){
                        chars[index++] = countString.charAt(j);
                    }
                }
                count = 0;
            }
        }
        return index;
    }
}
