package lab11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = null;

        System.out.print("Талбайг нь тооцоолох дүрсийн нэрийг оруул: ");
        String choice = sc.next().toLowerCase();

        switch (choice) {
            case "rectangle":
                System.out.print("Уртыг оруул (a): ");
                double ra = sc.nextDouble();
                System.out.print("Өргөнийг оруул (b): ");
                double rb = sc.nextDouble();
                shape = new Rectangle(ra, rb);
                break;
            case "square":
                System.out.print("Талын уртыг оруул (a): ");
                double sa = sc.nextDouble();
                shape = new Square(sa);
                break;
            case "triangle":
                System.out.print("Суурийн уртыг оруул (a): ");
                double ta = sc.nextDouble();
                System.out.print("Өндрийг оруул (h): ");
                double th = sc.nextDouble();
                shape = new Triangle(ta, th);
                break;
                
            case "circle":
                System.out.print("Радиусыг оруул (r): ");
                double cr = sc.nextDouble();
                shape = new Circle(cr);
                break;
                
            default:
                System.out.println("Буруу нэр орууллаа.");
        }

        if (shape != null) {
            shape.displayResult();
        }
        sc.close();
    }
}