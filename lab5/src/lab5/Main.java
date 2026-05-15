package lab5;

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        Employee.printCompanyInfo();

        System.out.println("--- Ажилтны мэдээллийг оруулна уу ---");


        System.out.print("Овог: ");
        String lastName = input.nextLine();

        System.out.print("Нэр: ");
        String firstName = input.nextLine();


        System.out.print("Нас: ");
        int age = input.nextInt();
        input.nextLine(); 


        System.out.print("Албан тушаал: ");
        String position = input.nextLine();


        System.out.print("Үндсэн цалин: ");
        double salary = input.nextDouble();


        Employee userEmployee = new Employee(firstName, lastName, age, position, salary);


        System.out.println("\n--- Оруулсан мэдээллийн боловсруулалт ---");
        userEmployee.displayInfo();

  
        input.close();
    }
}
