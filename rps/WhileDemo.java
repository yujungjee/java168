package rps;

import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			while(true) {
			System.out.println("0.그만하기   1.시작하기");
			switch(scanner.nextInt()) {
			case 0: System.out.println("게임 종료");
			return;
			case 1: System.out.println("게임 시작");
			break;
			}
			System.out.println();
		}
	}
	}
}
