/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */
public class StringOperationDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Hello Friends";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(6));// F
		System.out.println(s.indexOf("e"));
		System.out.println(s.lastIndexOf("e"));
		System.out.println(s.substring(6));// Count from 6 till end
		System.out.println(s.substring(6, 9));// n to m-1; exclude last index
		System.out.println(s.replace("e", "x"));
		System.out.println(s);
		System.out.println(s.concat("Welcome to java"));
		String ss = s + " Welcome to java";
		System.out.println(s.concat(ss));
		
		String s2 = "p1,p2,p3,p4,p5";
		System.out.println(s2);
		String[] arr = s2.split(",");
		for (String string : arr) {
			System.out.println(string);
		}
		
		System.out.println();
		
		String s3 = "";
		System.out.println(s3.length());
		System.out.println(s3.isEmpty());
		
		System.out.println(s.contains("Hello"));
		System.out.println(s2.contains("p3"));
		System.out.println(s2.contains("p7"));
		
		System.out.println(s.startsWith("Hello"));
		System.out.println(s.endsWith("ends"));
		
		String s4 = null;
		System.out.println(s4);
		System.out.println(s4.toUpperCase());
	}

}
