package test;

public class Person {
	private String name;
	private int age;
	private float height;
	
	public void setName(String name) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	void printStates() {
		System.out.println("이름: " + name + " , " + "나이: " + age + ", 키: " +height);
	}
}