/**
	Author : udakhe.swaraj
	Date : 28-May-2018
	Desc : String Demo - Compare reerence and Value
*/

class StringCompareDemo{
	public static void main(String[] args){
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		System.out.println(s1);
		System.out.println(s2);
		
		//reference comparison
		
		System.out.println(s1==s2);
		
		//value comparison
		
		System.out.println(s1.equals(s2));
		
		String s3 = s2; // assign reference
		
		System.out.println(s2==s3);
	}
}
