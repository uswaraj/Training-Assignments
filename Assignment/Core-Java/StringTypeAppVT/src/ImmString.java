/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */
public class ImmString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Fiends";
		
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		s1 = s1 + s2;//concat - try to modify
		
		System.out.println(s1);
		System.out.println(s1.hashCode());

	}

}
