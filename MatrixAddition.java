package com.company;

import static com.company.Utils.println;
import static com.company.Utils.print;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] firstMatrix = {{3, 4, 1}, {2, 1, 8}, {2, 4, 1}};
        int[][] secondMatrix = {{2, 3, 5}, {3, 4, 1}, {2, 4, 6}};
        addMatrix(firstMatrix, secondMatrix);
    }

    /*
    addMatrix() method to add two 3D - matrixs
    Input: two input matrix
    Output: sum of two 3D-matrixs
     */
    public static void addMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        // 2D Integer array declaration to store sum of two matrics
        int[][] sumMatrix = new int[3][3];
        println("Sum of first and second matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                print(sumMatrix[i][j] + " ");
            }
            print("\n");
        }
    }
}
