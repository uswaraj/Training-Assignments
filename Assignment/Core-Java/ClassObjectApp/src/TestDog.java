/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */

class Dog {
	// properties
	private int age;
//	String name;

	// action
	void eat() {
		System.out.println("Dog eating.." + age);
	}
	
	public void setAge(int a) {
		
		if (a > 0) {
			//allow
			age = a;
		}
		else {
			//wrong age 
			String errMsg = "Wrong value for age : " + a;
			throw new IllegalArgumentException(errMsg);
		}
	}
	
	public int  getAge() {
		return 10;
	}
}

public class TestDog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog d1; // reference only, not an object
		d1 = new Dog();// create object
//		d1.age = 10;
//		d1.age = -11; // logically can't be negative.
//		d1.name = "Tommy";
		d1.setAge(10);
		d1.eat();
		
		System.out.println("Age is : " + d1.getAge());
	}

}
