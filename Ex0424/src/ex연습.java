import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 24.
 * @time : 오후 5:41:50
 * @content : 기초연습문제
 *
 */
public class ex연습 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("오렌지의 갯수 >>");
		int num = scanner.nextInt();
		int num2 = 52;

		int div = num / num2;
		System.out.println(div + "박스");
	}

}
