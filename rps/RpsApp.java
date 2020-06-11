package rps;
/*결과값
"가위, 바위, 보를 고르세요."
"1. 가위 2. 바위 3. 보"
"****************"
"플레이어: 가위"
"컴퓨터 : 보"
"플레이어 승리 ( || 패배 || 무승부)"

결과값
"플레이어: 가위"
"컴퓨터: 보"
"승리"
"무승부"
"패배"
*/

import java.util.Random;
import java.util.Scanner;

public class RpsApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		while(true) {
			System.out.println("메뉴: 0.종료 1.게임");
			switch (scan.nextInt()) {
			case 0: System.out.println("종료");				
			return;
			case 1:game(scan, random);break;
			
			}
		}

	}


	/**
	 * @param scan
	 * @param random
	 */
	private static void game(Scanner scan, Random random) {
		System.out.println("가위, 바위, 보를 고르세요.");
		System.out.println("1. 가위, 2. 바위, 3.보");
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
		
		String rpsP = rps(player);
		String rpsC = rps(com);
			
		System.out.println("*****************************");
		System.out.println("플레이어: " + rpsP);
		System.out.println("컴퓨터: " + rpsC);
		System.out.println("플레이어: " + result);
	}

	/**
	 * @param com
	 * @return
	 */
	private static String rps(int com) {
		String rpsC = "";
		
		switch(com) {
		case 1: rpsC = "가위"; break;
		case 2: rpsC = "바위"; break;
		case 3: rpsC = "보"; break;
		}
		return rpsC;
	}

	/**
	 * @param player
	 * @return
	 */
	private static String rps(int player) {
		String rpsP = "";
		
		switch(player) {
		case 1: rpsP = "가위"; break;  
		case 2: rpsP = "바위"; break;
		case 3: rpsP = "보"; break;
		}
		return rpsP;
	}
}