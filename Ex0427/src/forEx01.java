import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 27.
 * @time : 오후 3:08:50
 * @content : 반복문
 *
 */
public class forEx01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 3; i <= 100; i += 3) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.print("숫자 입력 >> ");
		int num = scanner.nextInt();

		for (int i = num; i <= num * 10; i += num) {
			System.out.print(i + " ");
		}

		scanner.close();
	}

}
