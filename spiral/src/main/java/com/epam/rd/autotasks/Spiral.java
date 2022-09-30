package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        int count = 1, stCol = 0, endCol = columns - 1, stRow = 0, endRow = rows - 1;
        while (stCol <= endCol && stRow <= endRow) {
            if (count > rows * columns) {
                break;
            } else {
                for (int i = stCol; i <= endCol; i++) {
                    matrix[stRow][i] = count;
                    count++;
                }
                stRow++;

                for (int i = stRow; i <= endRow; i++) {
                    matrix[i][endCol] = count;
                    count++;
                }
                endCol--;
                if (count > rows * columns) {
                    break;
                }

                for (int i = endCol; i >= stCol; i--) {
                    matrix[endRow][i] = count;
                    count++;
                }
                endRow--;

                for (int i = endRow; i >= stRow; i--) {
                    matrix[i][stCol] = count;
                    count++;
                }
                stCol++;
            }
        }
        return matrix;
    }
}