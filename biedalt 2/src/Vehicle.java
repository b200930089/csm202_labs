public class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    protected void startEngine() {
        System.out.println(brand + " хөдөлгүүр аслаа.");
    }

    protected void stopEngine() {
        System.out.println(brand + " хөдөлгүүр унтарлаа.");
    }

    protected String getBasicInfo() {
        return "Брэнд: " + brand + ", Үйлдвэрлэсэн он: " + year;
    }
}
