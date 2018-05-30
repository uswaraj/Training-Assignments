/**
 * 
 */

/**
 * @author udakhe.swaraj
 *
 */
public class EmpService {

	public void save(Emp e) {
		System.out.println("---save---" + e.getName() + e.getEmpId());
		//TODO: Database code or file code to save data
	}
	
	public Emp getEmp() {
		Emp e = new Emp(1, "Swaraj");//dummy data
		return e;
	}
}
