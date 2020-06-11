package rps;

import java.util.Random;
import java.util.Scanner;

public class RpsApp2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		while(true) {
			System.out.println("0.그만하기   1.시작하기");
			
			switch(scan.nextInt()) {
			case 0: System.out.println("게임 종료!");
			return;
			case 1: game(scan, random);
			break;
			
			
			}
			}
		}

	/**
	 * @param scan
	 * @param random
	 */
	private static void game(Scanner scan, Random random) {
		System.out.println("가위, 바위, 보");
		System.out.println("1.가위    2. 바위    3.보");
		int player = scan.nextInt();
		int com = random.nextInt(3)+1; // 0+1+2+3
		String result = "";

		if(player == 1 && com == 2) {result = "패배";
		} else if(player == 1 && com == 3) {result = "승리";
		} else if(player == 2 && com == 1) {result = "승리";
		} else if(player == 2 && com == 3) {result = "패배";
		} else if(player == 3 && com == 1) {result = "패배";
		} else if(player == 3 && com == 2) {result = "승리";
		} else {result = "무승부";}
		
		String rpsC = "";
		String rpsP = "";
		
		switch(com) {
		case 1: rpsC = "가위";
		break;
		case 2: rpsC = "바위";
		break;
		case 3: rpsC = "보";
		break;
		}
		return;
	}
}
		switch(player) {
		case 1: rpsP = "가위";
		break;
		case 2: rpsP = "바위";
		break;
		case 3: rpsP = "보";
		break;
		}
		return;

	System.out.println("*****************************");
	System.out.println("플레이어: " + player);
	System.out.println("컴퓨터: " + com);
	System.out.println("플레이어: " + result);

	}	
}