public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); 
        this.numberOfDoors = numberOfDoors;
    }

    private void lockDoors() {
        System.out.println(numberOfDoors + " хаалга түгжигдлээ.");
    }

    private void checkAC() {
        System.out.println("Агааржуулагч хэвийн ажиллаж байна.");
    }

    public void displayCarDetails() {
        System.out.println("--- Автомашины мэдээлэл ---");
        System.out.println(getBasicInfo());
        System.out.println("Хаалганы тоо: " + numberOfDoors);
        startEngine(); 
        lockDoors();   
        checkAC();     
    }
}
