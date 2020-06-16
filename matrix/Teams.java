package matrix;

public class Teams {
	public static void main(String[] args) {
		String[][] teams = {{"A", "B", "C", "D"},
				{"E", "F", "G", "H"},
				{"I", "J", "K", "L"},
				{"N", "M", "O", "P"}};
		for(int i = 0; i<teams.length; i++ ) {
			for(int j = 0; j < teams[i].length; j++) {
			System.out.printf("%s\t", teams[i][j]);
			}
			System.out.println();
		}
	}
}
