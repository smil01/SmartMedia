import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 25.
 * @time : 오후 3:35:36
 * @content : 3항연산자
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("농구공의 개수를 입력하세요 : ");
		int num = scanner.nextInt();

		int size = 5;
		int box = num / 5;

		box += (box % size > 0) ? 1 : 0;

		System.out.println("필요한 상자의 수 : " + box);
	}

}
