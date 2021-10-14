package com.company;

import java.util.HashMap;
import java.util.Map;

public class Q6IsomorphicStrings {
    public static void main(String[] args) {
        Q6IsomorphicStrings is = new Q6IsomorphicStrings();
        String s1 = "egg";
        String t1 = "add";
        System.out.println("s = " + s1);
        System.out.println("t = " + t1);
        System.out.println("Output: " + is.isIsomorphic(s1,t1));

        String s2 = "foo";
        String t2 = "bar";
        System.out.println("\ns = " + s2);
        System.out.println("t = " + t2);
        System.out.println("Output: " + is.isIsomorphic(s2,t2));

        String s3 = "paper";
        String t3 = "title";
        System.out.println("\ns = " + s3);
        System.out.println("t = " + t3);
        System.out.println("Output: " + is.isIsomorphic(s3,t3));
    }

    //Time Complexity:O(n)
    //Space Complexity:O(n)
    public boolean isIsomorphic(String s, String t) {
        Map mapS = new HashMap();
        Map mapT = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            if (!mapS.containsKey(s.charAt(i))){
                mapS.put(s.charAt(i),i);
            }
            if (!mapT.containsKey(t.charAt(i))){
                mapT.put(t.charAt(i),i);
            }
            if (mapS.get(s.charAt(i))!= mapT.get(t.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
