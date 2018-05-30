/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */

class Emp{
	int empId;
	String name;
	
	public Emp(int eid, String n) {
		empId = eid;
		name = n;
	}
	void doTask(){
		System.out.println("Employee doing some task.." + empId + name);
	}
}

public class TestObjectArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Emp[] emp = new Emp[3];
		//Initialize array
		
		/*for (Emp emp2 : emp) {
			System.out.println(emp2);
		}*/
		
		/*Emp[] emp = new Emp[] {new Emp(1, "Raj"), new Emp(2, "Swaraj"), new Emp(3, "Amit")};
		
		for (int i = 0; i < emp.length; i++) {
				emp[i].doTask();
		}*/
		
		Emp[] emps = new Emp[3];
		Emp e = new Emp(1, "Raj");
		
		emps[0] = e;
		emps[1] = new Emp(2, "Swaraj");
		emps[3] = new Emp(2, "Amit");
		
		for (Emp emp2 : emps) {
			emp2.doTask();
		}
		
	}

}
