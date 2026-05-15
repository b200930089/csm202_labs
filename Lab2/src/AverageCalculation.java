import java.util.Scanner;

public class AverageCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("1-р тоог оруул: ");
        double a = input.nextDouble();
        System.out.print("2-р тоог оруул: ");
        double b = input.nextDouble();
        
        double arithmeticMean = (a + b) / 2;
        double geometricMean = Math.sqrt(a * b);
        
        System.out.println("Арифметик дундаж: " + arithmeticMean);
        System.out.println("Геометр дундаж: " + geometricMean);
    }
}