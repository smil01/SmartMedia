
public class Drink_Main {

	public static void main(String[] args) {
		// �ݶ� 1200 4��
		// ���� 500 1��
		// Ŀ�� 5500 3��

		DrinkVO cocaCola = new DrinkVO(1200, "�ݶ�", 4);
		DrinkVO mineralWater = new DrinkVO(500, "����", 1);
		DrinkVO starbucksCoffee = new DrinkVO(5500, "����Ŀ��", 3);
		
		
		System.out.println(cocaCola);
		System.out.println(mineralWater);
		System.out.println(starbucksCoffee);
	}
}
