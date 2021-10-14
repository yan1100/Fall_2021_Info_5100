package com.company;

import java.sql.Time;
import java.util.*;

public class Q5SpiralMatrix {
    public static void main(String[] args) {
        Q5SpiralMatrix sm = new Q5SpiralMatrix();

        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Input: " + Arrays.deepToString(matrix1));
        System.out.println("Output: " + sm.spiralOrder(matrix1));

        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("\nInput: " + Arrays.deepToString(matrix2));
        System.out.println("Output: " + sm.spiralOrder(matrix2));

        int[][] matrix3 = {{1,2,3,4},{5,6,7,8}};
        System.out.println("\nInput: " + Arrays.deepToString(matrix3));
        System.out.println("Output: " + sm.spiralOrder(matrix3));

    }

    //Time Complexity: O(m * n) : m == matrix.length, n == matrix[i].length
    //Space Complexity: O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;
        int rStart = 0;
        int cStart = 0;
        int rEnd = row - 1;
        int cEnd = col - 1;

        int n;
        if (Math.min(row,col) % 2 != 0){
            n = Math.min(row,col) / 2 + 1;
        }else {
            n = Math.min(row,col) / 2;
        }

        while (count < n) {
            if (rStart == rEnd) {
                for (int i = cStart; i <= cEnd; i++) {
                    ans.add(matrix[rStart][i]);
                }
            } else if (cStart == cEnd) {
                for (int i = rStart; i <= rEnd; i++) {
                    ans.add(matrix[i][cStart]);
                }
            } else {
                //from left to right
                for (int i = cStart; i < cEnd; i++) {
                    ans.add(matrix[rStart][i]);
                }
                //from up to down
                for (int i = rStart; i < rEnd; i++) {
                    ans.add(matrix[i][cEnd]);
                }
                //from right to left
                for (int i = cEnd; i > cStart; i--) {
                    ans.add(matrix[rEnd][i]);
                }
                //from down to up
                for (int i = rEnd; i > rStart; i--) {
                    ans.add(matrix[i][cStart]);
                }
            }
            rStart++;
            cStart++;
            rEnd--;
            cEnd--;
            count++;
        }
        return ans;
    }
}
