package collectionlist;

public class EmployeeList {
	
	private int EId;
    private String Emp_Name;
    private int Salary;
	public int getEId() {
		return EId;
	}
	public void setEId(int eId) {
		EId = eId;
	}
	public String getEmp_Name() {
		return Emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public EmployeeList(int eId, String emp_Name, int salary) {
		super();
		EId = eId;
		Emp_Name = emp_Name;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeList [EId=" + EId + ", Emp_Name=" + Emp_Name + ", Salary=" + Salary + "]";
	}
    
    

}
