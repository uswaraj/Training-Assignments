/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		char[] arr = new char[]{'H', 'e', 'l', 'l', 'o'};
		String s3 = new String(arr);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
