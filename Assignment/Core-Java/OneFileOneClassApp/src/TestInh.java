/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */
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