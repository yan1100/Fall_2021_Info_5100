package com.company;

import java.util.Arrays;

public class Q4RotateImage {
    public static void main(String[] args) {
        Q4RotateImage rotateImage = new Q4RotateImage();

        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Input: " + Arrays.deepToString(matrix1));
        rotateImage.rotate(matrix1);
        System.out.println("Output: " + Arrays.deepToString(matrix1));

        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println("\nInput: " + Arrays.deepToString(matrix2));
        rotateImage.rotate(matrix2);
        System.out.println("Output: " + Arrays.deepToString(matrix2));

        int[][] matrix3 = {{1}};
        System.out.println("\nInput: " + Arrays.deepToString(matrix3));
        rotateImage.rotate(matrix3);
        System.out.println("Output: " + Arrays.deepToString(matrix3));

        int[][] matrix4 = {{1,2},{3,4}};
        System.out.println("\nInput: " + Arrays.deepToString(matrix4));
        rotateImage.rotate(matrix4);
        System.out.println("Output: " + Arrays.deepToString(matrix4));
    }

    //Time Complexity: O (n*n): matrix.length = n, matrix[0].length = n,
    //Space Complexity: O(1)
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        for (int i = 0; i < (n + 1) / 2; i++){
            for (int j = i; j < n - i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix [n - j][i];
                matrix [n - j][i] = matrix [n - i][n - j];
                matrix [n - i][n - j] = matrix [j][n - i];
                matrix [j][n - i] = temp;
            }
        }
    }
}
