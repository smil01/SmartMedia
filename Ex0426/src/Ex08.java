import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 26.
 * @time : ���� 4:34:03
 * @content : ����
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int num = random.nextInt(20)+1;
		int input = 0;
		System.out.println("���� ���� : " + num);
		

		while (num != input) {
			System.out.print("number : ");
			input = scanner.nextInt();

			if (num > input) {
				System.out.println("Up");
			} else if (num < input) {
				System.out.println("Down");
			}
		}
		
		System.out.println("Success");
	}

}
