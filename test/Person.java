package test;

public class Person {
	private String name;
	private int age;
	private float height;
	
	public void setName(String name, age, height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	void printStates() {
		System.out.println("�̸�: " + name + " , " + "����: " + age + ", Ű: " +height);
	}
}