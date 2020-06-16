package matrix;

import java.util.Random;

public class Rank3 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] scores = new int[5];
		int[] rank = new int[5];
		
		for(int i = 0; i < rank.length; i++) {
			scores[i] = random.nextInt(101);
			rank[i] = 1;
		}
		for(int i = 0; i < rank.length; i++) {
			for(int j = 0; j < rank.length; j++) {
				if(scores[i] < scores[j]) {
					rank[i] ++;
				}
			}
		}
		for (int i = 0; i < rank.length; i++) {
			
		}
	}
}
