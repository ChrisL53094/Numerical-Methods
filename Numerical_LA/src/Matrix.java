
public class Matrix {
	
	int n_rows;
	int n_col;
	int[][] values;
	
	
	public Matrix (int m, int n) {
		n_rows = m;
		n_col = n;
		values = new int[m][n];
	}
	
	public void setValues(int[][] v) {
		values = v;
	}
	
	public int[] getSize() {
		int[] size =  {n_rows,n_col};
		return size;
	}
	
	
//	public Matrix multi(Matrix other) {
//		
//	}
	
	
}
