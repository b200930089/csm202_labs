package lab11;

public class Circle implements Shape {
    private double r;
    public Circle(double r) { this.r = r; }
    public double calculateArea() { return Math.PI * r * r; }
    public void displayResult() {
        System.out.printf("Тойргийн талбай: %.2f\n", calculateArea());
    }
}
