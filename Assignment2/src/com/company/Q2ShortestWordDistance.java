package com.company;

public class Q2ShortestWordDistance {
    public static void main(String[] args) {
        Q2ShortestWordDistance swd = new Q2ShortestWordDistance();
        String[] wordsDict1 = {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(swd.shortestDistance(wordsDict1,"coding","practice"));//output:3
        System.out.println(swd.shortestDistance(wordsDict1,"practice","perfect"));//output:2
        System.out.println(swd.shortestDistance(wordsDict1,"makes","coding"));//output:1

    }

    //Time Complexity:O(n * m): n == wordsDict.length, m = word1.length() + words2.length()
    //Space Complexity:O(1)
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int index1 = -1;
        int index2 = -1;
        int distance = wordsDict.length;
        for (int i = 0; i < wordsDict.length; i++) {
            if (wordsDict[i].equals(word1)){
                index1 = i;
            }else if (wordsDict[i].equals(word2)) {
                index2 = i;
            }
            if (index1 >= 0 && index2 >= 0){
                distance = Math.min(distance,Math.abs(index1 - index2));
            }
        }
        return distance;
    }
}
