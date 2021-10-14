package com.company;

import java.util.Arrays;

public class Q1TransposeMatrix {
    public static void main(String[] args) {
        Q1TransposeMatrix transposeMatrix = new Q1TransposeMatrix();

        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Input: " + Arrays.deepToString(matrix1));
        System.out.println("Output: " + Arrays.deepToString(transposeMatrix.transpose(matrix1)));

        int[][] matrix2 = {{1,2,3},{4,5,6}};
        System.out.println("\nInput: " + Arrays.deepToString(matrix2));
        System.out.println("Output: " + Arrays.deepToString(transposeMatrix.transpose(matrix2)));

        int[][] matrix3 = {{1},{1}};
        System.out.println("\nInput: " + Arrays.deepToString(matrix3));
        System.out.println("Output: " + Arrays.deepToString(transposeMatrix.transpose(matrix3)));



    }

    //Time Complexity: O(m*n): m == matrix.length, n == matrix[i].length
    //Space Complexity: O(m*n)
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[col][row];
        for (int r = 0; r < row; r++){
            for (int c = 0; c < col; c ++){
                ans[c][r] = matrix [r][c];
            }
        }
        return ans;
    }

}
