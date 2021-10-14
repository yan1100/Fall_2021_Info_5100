package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q9ReverseWords {
    public static void main(String[] args) {
        Q9ReverseWords rw = new Q9ReverseWords();

        String s1 = "the sky is blue";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + rw.reverseWords(s1));

        String s2 = "  hello world  ";
        System.out.println("\nInput: " + s2);
        System.out.println("Output: " + rw.reverseWords(s2));

        String s3 = "a good   example";
        System.out.println("\nInput: " + s3);
        System.out.println("Output: " + rw.reverseWords(s3));
    }

    //Time Complexity:
    //Space Complexity:
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = words.length - 1; i > -1; i--){
            if (!words[i].isEmpty()){
                ans.append(words[i]).append(" ");
            }
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
}
