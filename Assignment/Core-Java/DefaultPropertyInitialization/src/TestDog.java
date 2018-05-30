/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */
class Dog{
	
	int age = 2;
	
	void eat(){
		
		System.out.println("Dog is eating.." + age);
	}
}

public class TestDog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.eat();
		
		Dog d2 = new Dog();
		d2.age = 5;
		d2.eat();
	}

}
