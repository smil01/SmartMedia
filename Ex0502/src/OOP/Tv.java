package OOP;

public class Tv {
	String com_name;
	
	int size;
	int light;
	int chanel = 0;
	int vol;
	
	boolean pow;
	
	
	public void powerOn() {
		System.out.println("Ƽ�� �������ϴ�.");
	}
	
	public void powerOff() {
		System.out.println("Ƽ�� �������ϴ�.");
	}
	
	public int chanelUp() {
		return ++chanel;
	}
	
	public int chanelDown() {
		return --chanel;
	}
	
}
