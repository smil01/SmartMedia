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
		System.out.println(ob); // Object���� toString�̶�� �޼��尡 �ֱ� ������
		// Object�� ��ӹ޾Ƽ� ���ǵ� ��� �ڷ������� �޾Ƽ� ����� �� �� �ִ�.
	}

}
