package matrix;
/*
5명의 점수를 입력 받아서 
1등 90점, 2등 86점, 3등 77점, 4등 66점, 5등 40점으로 
출력하시오. 출력시 행렬을 반드시 사용하시오.
 */

import java.util.Random;
import java.util.Scanner;

public class Rank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int[] scores = new int[5];
		int[] rank = new int[5];

		for(int i = 0; i < rank.length; i++) {
			scores[i] = random.nextInt(101);
			rank[i] = 1;
		}
		for(int i = 0; i < rank.length; i++) {
			for(int j = 0; j <rank.length; j++) {
				if(scores[i] < scores[j]) {
					rank[i] ++;
				}
			}
		}	
		for(int i = 0; i < rank.length; i++) {
			System.out.printf(" %d 등 : %d 점\n", rank[i], scores[i]);
		}
	}
}