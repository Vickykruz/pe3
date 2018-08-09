package com.stackroute.pe3;

public class MatrixAdd {

	public int[][] addition(int[][]x, int[][]y) {
		int rows = x[0].length;
        int columns = y[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                result[i][j] = x[i][j] + y[i][j];
            }
        }
        return result;
 }
}