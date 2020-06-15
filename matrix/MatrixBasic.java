package matrix;

public class MatrixBasic {
	public static void main(String[] args) {
		int[][] mtx = new int[3][5];
		int num = 1;
		
		for(int i = 0; i < mtx.length; i++) {
			System.out.println("");
			for(int j = 0; j < mtx[i].length; j++) {
				mtx[i][j] = num;
				System.out.printf(mtx[i][j] + "\t");
			num++;
			}
		}
	}
}