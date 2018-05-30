/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */

class Dog {

	private int age;
	private String name;

	public Dog() {
		System.out.println("---Default---");
		// default
		age = 2;
	}
	
	public Dog(int a, String n) {
		System.out.println("---Parameterized---");

		age = a;
		name = n;
	}

	void eat() {
		System.out.println("Dog is eating.." + age + " " + name);
	}
}

public class TestConst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Dog d1 = new Dog();
		d1.eat();
		System.out.println();
		
		Dog d2 = new Dog(5, "Tommy");
		d2.eat();
	}

}
