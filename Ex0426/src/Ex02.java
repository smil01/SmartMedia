import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 26.
 * @time : ���� 2:31:43
 * @content : if else
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("������ �Է��Ͻÿ�. (��������)>> ");
		int SALARY = scanner.nextInt();
		int BONUS = 0;
		int grossIncome = 0;

		if (SALARY >= 300) {
			BONUS = 50;
		} else if (SALARY >= 200) {
			BONUS = 30;
		} else if (SALARY >= 100) {
			BONUS = 20;
		}

		grossIncome = SALARY + BONUS;

		System.out.println("�̹��� �� �ҵ���� " + grossIncome + "���� �Դϴ�.");
		
		scanner.close();
	}

}
