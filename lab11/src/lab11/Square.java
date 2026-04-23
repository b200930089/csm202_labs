package lab11;

public class Square implements Shape {
    private double a;
    public Square(double a) { this.a = a; }
    public double calculateArea() { return a * a; }
    public void displayResult() {
        System.out.printf("Квадратын талбай: %.2f\n", calculateArea());
    }
}
