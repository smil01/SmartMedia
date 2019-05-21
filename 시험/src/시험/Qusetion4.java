package 시험;

public class Qusetion4 {
	// TODO : Train, Bus, Airplane클래스의 인터페이스는 Traffic클래스로 정의하였습니다.
	public static void main(String[] args) {
		goBusan(new Train());
		goBusan(new Bus());
		goBusan(new Airplane());
	}

	private static void goBusan(Traffic b) {
		b.go();
	}

}
