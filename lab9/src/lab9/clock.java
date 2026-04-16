package lab9;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.time.format.DateTimeFormatter;

public class clock {
	private int year;
	private int month;
	private int day;
	private int hour;
	private int minute;
	private int second;
	private LocalDateTime ldt;
	private DateTimeFormatter formatter;
	
	public clock() {
		formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	}
	
	public void setClock(int y, int mon, int d, int h, int min, int s) {
		this.year = y;
		this.month = mon;
		this.day = d;
		this.hour = h;
		this.minute = min;
		this.second = s;
		
		this.ldt = LocalDateTime.of(year, month, day, hour, minute, second);
		System.out.println("Tsagiin garaar tohiruulna: " + ldt.format(formatter));
	}
	
	public void autoSetClock() {
		this.ldt = LocalDateTime.now();
		this.year = ldt.getYear();
		this.month = ldt.getMonthValue();
		this.day = ldt.getDayOfMonth();
		this.hour = ldt.getHour();
		this.second = ldt.getSecond();
		System.out.println(ldt.format(formatter));
	}
	
	public void tickClock() {
		runClock(1000);
	}
	
	public void tickClock(int tick) {
		runClock(tick);
	}
	
	private void runClock(int seconds) {
		if(ldt == null) {
			autoSetClock();
		}
		
		for (int i = 0; i < seconds; i++) {
			try {
				System.out.println("Odoogiin tsag" + ldt.format(formatter));
				
				TimeUnit.MILLISECONDS.sleep(1000);
				
				ldt = ldt.plusSeconds(1);
			} catch (InterruptedException e) {
				System.out.println("Error");
			}
			System.out.println("Tsag zogsloo");
		}
	}
}
