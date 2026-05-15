import java.util.Scanner;

public class GerBusluur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Гэрийн радиус (R)-ийг оруул: ");
        double r = input.nextDouble();
        

        double busluur = 2 * Math.PI * r;
        
        System.out.printf("Гэрийн нэг удаа тойрох бүслүүрийн урт: %.2f метр\n", busluur);
        System.out.printf("Хэрэв 3 бүслүүртэй бол нийт: %.2f метр\n", busluur * 3);
    }
}
