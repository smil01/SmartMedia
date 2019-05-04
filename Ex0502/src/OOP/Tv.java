package OOP;

public class Tv {
	String com_name;
	
	int size;
	int light;
	int chanel = 0;
	int vol;
	
	boolean pow;
	
	
	public void powerOn() {
		System.out.println("티비가 켜졌습니다.");
	}
	
	public void powerOff() {
		System.out.println("티비가 꺼졌습니다.");
	}
	
	public int chanelUp() {
		return ++chanel;
	}
	
	public int chanelDown() {
		return --chanel;
	}
	
}
