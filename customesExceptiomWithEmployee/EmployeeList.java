package customesExceptiomWithEmployee;
//This  calss is used for creating employee list

public class EmployeeList {
	/** employeeList consturtors
	 * 
	 * @param employeeId
	 * @param name
	 * @param mobileNo
	 * @param department
	 * @param salary
	 */
	public EmployeeList(int employeeId, String name, long mobileNo, String department,double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.department = department;
		this.salary=salary;
	}
	private int employeeId;
	private String name;
	private long mobileNo;
	private String department;
	private double salary;
	
	public String toString() {
		return "Employee details :[Name : "+name+" EmployeeId : "+employeeId+" MobileNo : "+mobileNo+" Department : "+department+" salary : "+salary+" ]";
	}
	
}
