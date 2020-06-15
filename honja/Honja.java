package honja;

public class Honja {
	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.setName("boby");
		
		Animal dog = new Animal();
		dog.setName("happy");
		
		System.out.println(cat.name);
		System.out.println(dog.name);
	}
}