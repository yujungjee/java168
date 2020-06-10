package test;

import java.util.Scanner;

public class ShopApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shop[] shops = new Shop[3];
		
		System.out.println("고객 3명이 줄을 섰습니다.");
		
		for(int i = 0; i < shops.length; i++) {
			Shop shop = new Shop();
			System.out.println("고객 이름: ");
			shop.setName(scanner.next());
			
			System.out.println("폰가격: ");
			shop.setPhone(scanner.nextInt());
			
			System.out.println("TV가격: ");
			shop.setTv(scanner.nextInt());
			
			System.out.println("컴퓨터가격: ");
			shop.setComputer(scanner.nextInt());
			
			shop.sum();
			shops[i] = shop;
		}
		for(int i = 0; i < shops.length; i++) {
			shops[i].printStates();
		}
	}
}
