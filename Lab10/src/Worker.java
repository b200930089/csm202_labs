
public class Worker extends Person {
	private String workerId;
	private String department;
	private String hireDate;
	
	public Worker(String lastname, String firstname, String registerNo, String birthDate, String workerId, String department, String hireDate	) {
		super(lastname, firstname, registerNo, birthDate);
		this.workerId = workerId;
		this.department = department;
		this.hireDate = hireDate;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("Employee Information");
		System.out.println("Employee ID: " + workerId);
		System.out.println("Department Information: " + department);
		System.out.println("Hired date: " + getYear(hireDate) + "/" + getMonth(hireDate) + "/" + getDay(hireDate));
	}
}
