
public class Matrix {
	
	int n_rows;
	int n_col;
	float[][] values;
	
	
	public Matrix (int m, int n) {
		n_rows = m;
		n_col = n;
		values = new float[m][n];
	}
	
	public Matrix (int m, int n, float[][] v) {
		n_rows = m;
		n_col = n;
		values = v;
	}
	
	public void setValues(float[][] v) {
		values = v;
	}
	
	
	public float getIndex(int i , int j) {
		return values[i][j];
	}
	
	
	public int[] getSize() {
		int[] size =  {n_rows,n_col};
		return size;
	}
	
	public Matrix multiply(Matrix B) throws Exception {
		if (B.n_rows != n_col) {
			throw new Exception("Incompatable Matrix Multiplication");
		}
		else {
			Matrix C = new Matrix(n_rows,B.n_col);
			for (int i=0; i<n_rows; i++) {
				for (int j=0; j<B.n_col; j++) {
					C.values[i][j] = 0;
					for(int k=0; k<n_rows; k++) {
						C.values[i][j] += values[i][k]*B.values[k][j];
					}
				}
				
				
			}
			return C;
		}
	}
	
//	public Matrix multi(Matrix other) {
//		
//	}
	
	
}
