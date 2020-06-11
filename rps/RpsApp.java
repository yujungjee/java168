package rps;
/*결과값
"가위, 바위, 보를 고르세요."
"1. 가위 2. 바위 3. 보"
"****************"
"플레이어: 가위"
"컴퓨터 : 보"
"플레이어 승리 ( || 패배 || 무승부)"
*/

import java.util.Scanner;

public class RpsApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위, 바위, 보를 고르세요.");
		System.out.println("1. 가위 2. 바위 3.보");
		
		int player = scan.nextInt();
		int computer = 0;
		String result = "";
		
		System.out.println("*******************");
		System.out.println("플레이어: " + player);
		System.out.println("컴퓨터: 바위" + computer);
		System.out.println("플레이어: 패배" + result);
	}
}