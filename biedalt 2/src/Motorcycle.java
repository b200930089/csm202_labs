public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    private void helmetReminder() {
        System.out.println("Санамж: Хамгаалалтын дуулгаа өмсөнө үү!");
    }

    private void checkKickstand() {
        System.out.println("Мотоциклын тулгуурыг авлаа.");
    }

    public void displayBikeDetails() {
        System.out.println("\n--- Мотоциклын мэдээлэл ---");
        System.out.println(getBasicInfo());
        System.out.println("Хажуугийн чиргүүлтэй эсэх: " + (hasSidecar ? "Тийм" : "Үгүй"));
        helmetReminder();
        checkKickstand();
        startEngine();
    }
}
