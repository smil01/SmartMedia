package ����;

public class Qusetion4 {
	// TODO : Train, Bus, AirplaneŬ������ �������̽��� TrafficŬ������ �����Ͽ����ϴ�.
	public static void main(String[] args) {
		goBusan(new Train());
		goBusan(new Bus());
		goBusan(new Airplane());
	}

	private static void goBusan(Traffic b) {
		b.go();
	}

}
