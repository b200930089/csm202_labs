package lab9;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		clock myClock = new clock();
		
        System.out.println("1. Garaar");
        System.out.println("2. Auto");
        System.out.print("Сонголт: ");
        int choice = sc.nextInt();
		
        if (choice == 1) {
            System.out.print("Jil: "); int y = sc.nextInt();
            System.out.print("Sar: "); int mon = sc.nextInt();
            System.out.print("Udur: "); int d = sc.nextInt();
            System.out.print("Tsag: "); int h = sc.nextInt();
            System.out.print("Minut: "); int min = sc.nextInt();
            System.out.print("Secund: "); int s = sc.nextInt();
            myClock.setClock(y, mon, d, h, min, s);
        } else {
            myClock.autoSetClock();
        }
        
		myClock.tickClock(1000); 
	}

}
