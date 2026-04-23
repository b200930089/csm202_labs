package lab11;

public class Triangle implements Shape {
    private double a, h;
    public Triangle(double a, double h) { this.a = a; this.h = h; }
    public double calculateArea() { return 0.5 * a * h; }
    public void displayResult() {
        System.out.printf("Гурвалжны талбай: %.2f\n", calculateArea());
    }
}
