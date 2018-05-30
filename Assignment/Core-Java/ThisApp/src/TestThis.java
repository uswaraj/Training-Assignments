/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */

class Emp{
	
	//instance variable
	int empId;
	String name;
	
	void doTask(){
		System.out.println("Emp doing some task..." + this.empId + " " + this.name);
		System.out.println("Emp doing some task..." + empId + " " + name);
		System.out.println("this:" + this.hashCode());
		this.test();//calling same class method
//		test();
	}
	
	//instance method
	void test(){
		System.out.println("Testing...");
	}
}

public class TestThis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Emp e1 = new Emp();
		e1.empId = 101;
		e1.name = "Swaraj";
		
		e1.doTask();
		System.out.println("e1 : " + e1.hashCode());
		
		System.out.println();
		
		/*Emp e2 = new Emp();
		e2.doTask();
		System.out.println("e2 : " + e2.hashCode());*/
	}

}
