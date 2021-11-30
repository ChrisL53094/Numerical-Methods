import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import java.util.Random;

class MatrixTest {

	@Test
	void setValuesTest() {
		Matrix A = new Matrix(2,2);
		float[][] values = {{1,2},{3,4}};
		A.setValues(values);
		Assert.assertArrayEquals(values, A.values);
	}
	
	@Test
	void getSizeTest() {
		Random rand = new Random(); //instance of random class
	    int upperbound = 25;
	    //generate random values from 1-upperbound
	    int rand_row = rand.nextInt(upperbound)+1; 
	    int rand_col = rand.nextInt(upperbound)+1; 
	    Matrix A = new Matrix(rand_row,rand_col);
	    int[] check_size = {rand_row,rand_col};
	    Assert.assertArrayEquals(check_size, A.getSize());
	}
	
	@Test
	void getIndexTest() {
		float[][] values = {{1,2},{3,4}};
		Matrix A = new Matrix(2,2,values);
		
		A.setValues(values);
		Assert.assertEquals(A.getIndex(1, 0), 3, 1e-6);
	}
	
	@Test
	void multiplyTest() {
		float[][] values_a = {{1,2},{3,4}};
		Matrix A = new Matrix(2,2,values_a);
		
		float[][] values_b = {{7,2},{4,9}};
		Matrix B = new Matrix(2,2,values_b);
		
		Matrix C = new Matrix(2,2);
		try {
			C = A.multiply(B);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		float[][] check_values = {{15,20},{37,42}};
		Matrix Check = new Matrix(2,2,check_values);
		Assert.assertArrayEquals(check_values, C.values);
	}
	

}
