import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("A координатуудыг оруул: ");
        double ax = input.nextDouble();
        double ay = input.nextDouble();
        

        System.out.print("B координатуудыг оруул: ");
        double bx = input.nextDouble();
        double by = input.nextDouble();
        

        System.out.print("C координатуудыг оруул: ");
        double cx = input.nextDouble();
        double cy = input.nextDouble();
        
        double area = 0.5 * Math.abs(ax * (by - cy) + bx * (cy - ay) + cx * (ay - by));
        
        System.out.println("Гурвалжны талбай: " + area);
    }
}