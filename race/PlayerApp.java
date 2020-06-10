package race;

import java.util.Scanner;

public class PlayerApp {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Player[] players = new Player[3];
	
	for (int i = 0; i < players.length; i++) {
		Player player = new Player();
				System.out.println("1번 선수 이름: ");
				player.setName(scanner.next());
				
				System.out.println("2번 선수 이름: ");
				player.setRecord(scanner.nextInt());
				
				System.out.println("3번 선수 이름: ");
				player.setRecord(scanner.nextInt());
	}
	}
}

	
