import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter personality infomation");
		System.out.print("Lastname: ");
		String lastname = sc.nextLine();
		
		System.out.print("Firstname: ");
		String firstname = sc.nextLine();
		
		System.out.print("Regiter Number: ");
		String registerNo = sc.nextLine();
		
		System.out.print("Birth date(YYYY/MM/DD): ");
		String birth_date = sc.nextLine();
		
		System.out.println("Enter employee's information: ");
		System.out.print("Employee ID: ");
		String workerId = sc.nextLine();
		
		System.out.print("Department: ");
		String department = sc.nextLine();
		
		System.out.print("Hired Date: ");
		String hireDate = sc.nextLine();
		
		Worker employee = new Worker(
			lastname,
			firstname,
			registerNo,
			birth_date,
			workerId,
			department,
			hireDate
		);
		
		System.out.println("Result");
		employee.info();
		
		sc.close();	
	}
}
