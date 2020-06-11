package race;

import java.util.Scanner;

public class PlayerApp {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Player[] players = new Player[3];
	
	for(int i = 0; i < players.length; i++) {
		Player player = new Player();
				System.out.println("선수: ");
				String name = scanner.next();
				
				player.setName(name);
				
				System.out.println("100M 기록: ");
				int time = scanner.nextInt();
				player.setRecord(time);
				
				players[i] = player;
	}
	for(int i = 0; i < players.length; i++) {
		players[i].showRecord();
	}
	Player[] ranking = new Player[3];   
	String name = "";
	if(players[0].getRecord() < players[1].getRecord()
			&& players[0].getRecord() < players[2].getRecord()) {
		name = players[0].getName();
	} else if (players[1].getRecord() < players[0].getRecord()
				&& players[1].getRecord() < players[2].getRecord()) {
			name = players[1].getName();
	} else {
		name = players[2].getName();
	}
		System.out.println("1등 " + name);
	}
}