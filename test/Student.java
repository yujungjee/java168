package test;

public class Student {
	private String name;
	private int korean, english, math, sum;
	float avg;
	
	public void setName(String name) {
		this.name = name;		
	}
	public String getName() {
		return this.name;
	}
	public void setKor(int korean) {
		this.korean = korean;
	}
	public int getKor() {
		return this.korean;
	}
	public void setEng (int english) {
		this.english = english;
	}
	public int getEng () {
		return this.english;
	}
	public void setMath (int math) {
		this.math = math;
	}
	public int getMath () {
		return this.math;
	}
	public void sum() {
		this.sum = this.korean + this.english + this.math;
	}
	public void avg() {
		this.avg = this.sum / 3;
	}
	
	void printStates() {
		System.out.println("±¹¾î: " + korean + ", ¿µ¾î:" + english + ", ¼öÇÐ: "
				+ math + ", ÃÑÇÕ: " + sum + ", Æò±Õ:" + avg);
	}
}
