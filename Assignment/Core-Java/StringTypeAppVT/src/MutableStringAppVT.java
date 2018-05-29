/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */
public class MutableStringAppVT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sb: " + sb);
		System.out.println("sb: " + sb.hashCode());

		sb.append("Friends");	// try to modify
		System.out.println("sb: " + sb);
		System.out.println("sb: " + sb.hashCode());
	}

}
