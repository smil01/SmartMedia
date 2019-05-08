package ToyMachine;

public class Main {

	public static void main(String[] args) {
		Pika pika = new Pika();
		Pari pari = new Pari();
		Kobugi kobugi = new Kobugi();

		machine(pika);
		machine(pari);
		machine(kobugi);

		print(1);
		print("1");
		print('1');
		print(1.0);
		print(1.0f);
	}

	public static void machine(Pocket monsta) {
		monsta.p();
	}
	
	public static void print(Object ob) {
		System.out.println(ob); // Object에는 toString이라는 메서드가 있기 때문에
		// Object를 상속받아서 정의된 모든 자료형들을 받아서 출력할 수 도 있다.
	}

}
