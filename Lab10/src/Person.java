
public class Person {
	protected String lastname;
	protected String firstname;
	protected String registerNo;
	protected String birth_date;
	
	public Person (String lastname, String firstname, String registerNo, String birth_date) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.registerNo = registerNo;
		this.birth_date = birth_date;
	}
	
	public String getFullName(String lastname, String firstname) {
		return lastname.substring(0,1).toUpperCase() + " " + firstname;
	}
	
	protected int getYear(String birth_date) {
		String[] parts = birth_date.split("[./-]");
		return Integer.parseInt(parts[0]);
	}
	
	protected int getMonth(String birth_date) {
		String[] parts = birth_date.split("[./-]");
		return Integer.parseInt(parts[1]);
	}
	
	protected int getDay(String birth_date) {
		String[] parts = birth_date.split("[./-]");
		return Integer.parseInt(parts[2]);
	}
	
	protected void info() {
		System.out.println("Person informantion");
		System.out.println("Surname and Name: " + getFullName(lastname, lastname));
		System.out.println("Register Number: " + registerNo);
		System.out.println("Birth Date: " + getYear(birth_date) + "/" + getMonth(birth_date) + "/" + getDay(birth_date));
	}
}
