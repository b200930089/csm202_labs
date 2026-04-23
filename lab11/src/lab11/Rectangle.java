package lab11;

public class Rectangle implements Shape {
    private double a, b;
    public Rectangle(double a, double b) { this.a = a; this.b = b; }
    public double calculateArea() { return a * b; }
    public void displayResult() {
        System.out.printf("Тэгш өнцөгтийн талбай: ", calculateArea());
    }
}
