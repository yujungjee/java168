package test;

import java.util.Scanner;

public class ShopApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shop[] shops = new Shop[3];
		
		System.out.println("�� 3���� ���� �����ϴ�.");
		
		for(int i = 0; i < shops.length; i++) {
			Shop shop = new Shop();
			System.out.println("�� �̸�: ");
			shop.setName(scanner.next());
			
			System.out.println("������: ");
			shop.setPhone(scanner.nextInt());
			
			System.out.println("TV����: ");
			shop.setTv(scanner.nextInt());
			
			System.out.println("��ǻ�Ͱ���: ");
			shop.setComputer(scanner.nextInt());
			
			shop.sum();
			shops[i] = shop;
		}
		for(int i = 0; i < shops.length; i++) {
			shops[i].printStates();
		}
	}
}
