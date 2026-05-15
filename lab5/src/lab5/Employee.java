package lab5;


public class Employee {

 
 private String firstName;
 private String lastName;
 private int age;
 private String position; 
 private double salary;   


 public Employee() {
     this.firstName = "Unknown";
     this.lastName = "Unknown";
     this.age = 0;
     this.position = "Intern";
     this.salary = 0.0;
 }


 public Employee(String firstName, String lastName, int age, String position, double salary) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
     this.position = position;
     this.salary = salary;
 }


 public static void printCompanyInfo() {
     System.out.println("---------- Компанийн ерөнхий мэдээлэл ----------");
     System.out.println("Байгууллагын нэр: Технологийн Төв");
     System.out.println("Ажлын цаг: 09:00 - 18:00");
     System.out.println("----------------------------------------------");
 }


 private double calculateBonus() {
     double bonusRate;

     if (salary >= 5000000) {
         bonusRate = 0.15; 
     } else if (salary >= 2000000) {
         bonusRate = 0.10; 
     } else {
         bonusRate = 0.05; 
     }
     return salary * bonusRate;
 }


 private String getPositionLevel() {
     String level;

     switch (position) {
         case "Manager":
             level = "Senior Management";
             break;
         case "Developer":
             level = "Technical Team";
             break;
         case "Intern":
             level = "Junior Level";
             break;
         default:
             level = "Staff";
             break;
     }
     return level;
 }


 public void displayInfo() {
     System.out.println("--- Ажилтны мэдээлэл ---");
     System.out.println("Нэр: " + lastName + " " + firstName);
     System.out.println("Нас: " + age);
     System.out.println("Албан тушаал: " + position + " (" + getPositionLevel() + ")");
     System.out.println("Үндсэн цалин: " + salary + " ₮");
     System.out.println("Урамшуулал: " + calculateBonus() + " ₮");
     System.out.println("Нийт цалин: " + (salary + calculateBonus()) + " ₮");
     

     System.out.print("Гүйцэтгэлийн үнэлгээ: ");
     for (int i = 0; i < 5; i++) {
         System.out.print("★ ");
     }
     System.out.println("\n");
 }
}
