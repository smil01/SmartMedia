import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 25.
 * @time : 오후 4:03:32
 * @content : 조건문
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("나이 입력 : ");
		int age = scanner.nextInt();

		if (age >= 20) {
			System.out.println("성인입니다.");
			System.out.println("통과입니다.");
		} else {
			System.out.println("미짜입니다.");
			System.out.println("돌아가임마.");
		}

		System.out.println("종료되었습니다.");
	}

}
