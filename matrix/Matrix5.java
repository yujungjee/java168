package matrix;

public class Matrix5 {
//	5	10	15	20	25	
//	30	35	40	45	50	
//	55	60	65	70	75	
//	80	85	90	95	100	
//	105	110	115	120	125
	public static void main(String[] args) {
		int[][] mtx = new int[3][5];
		int num = 1;
		
		for(int i = 0; i < mtx.length; i++) {
			System.out.println("");
			for(int j = 0; j < mtx[i].length; j++) {
				mtx[i][j] = num*5;
				System.out.printf(mtx[i][j] + "\t");
			num++;
			}
		}
	}
}