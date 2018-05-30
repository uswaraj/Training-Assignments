/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Emp e = new Emp(101, "Amit");
		EmpService service = new EmpService();
		service.save(e);// 1.Object as argument
		
		Emp emp = service.getEmp();
		System.out.println("---emp---" + emp.getName() + " " + emp.getEmpId());
		
	}

}
