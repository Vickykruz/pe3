package com.stackroute.pe3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class MatrixAddTest {
	MatrixAdd ad = new MatrixAdd();
	int[][] matrix1 = {{3,2},{2,3},{3,5}};
	int[][] matrix2 = {{4,2},{2,3},{4,2}};
	int[][] sum1 = {{7,4},{4,6},{7,7}};
	int[][] sum2 = {{6,3},{3,2},{2,3}};

	@SuppressWarnings("deprecation")
	@Test
	public void testMatrix() {
	assertEquals(sum1,ad.addition(matrix1,matrix2));
	assertNotEquals(sum2,ad.addition(matrix1,matrix2));
	}

}
