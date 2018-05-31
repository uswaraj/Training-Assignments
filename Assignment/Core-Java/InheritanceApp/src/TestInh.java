/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */

class Animal{
	
	private String name;
	
	void eat(){
		System.out.println("animal is eating..." + name);
	}
	
	void run(){
		System.out.println("Animal is running..." + name);
	}
}

class Dog extends Animal{
	
	void bark(){
		System.out.println("Dog barking...");
	}
}
class Cat extends Animal{
	
	void bite(){
		System.out.println("Cat biting...");
	}
}


public class TestInh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Specialization-style
		Dog d = new Dog();
		d.eat();//inherited : reused
		d.eat();//inherited : reused
		d.bark();//own : extended
		
		System.out.println();
		
		Cat c = new Cat();
		c.eat(); //inherited : reused
		c.eat();//inherited : reused
		c.bite();//own : extended
	}

}
