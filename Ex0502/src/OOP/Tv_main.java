package OOP;

public class Tv_main {

	public static void main(String[] args) {
		Tv samsungTv = new Tv();
		samsungTv.powerOn();
		int channel = samsungTv.chanelUp();
		System.out.println(channel);
		
		Tv lgTv = new Tv();
		lgTv.powerOff();
		int channel2 = lgTv.chanelUp();
		System.out.println(channel2);
	}

}
