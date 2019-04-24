import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 24.
 * @time : 오후 4:50:43
 * @content : 자바 기초 수업
 *
 */

public class Ex03 {

	public static void main(String[] args) {
		// 두 수를 입력 받아서 더한 결과를 출력
		// 입력도 배웠고, 덧셈도 배웟고, 출력도 배웟다.
		// but 입력한 숫자데이터
 
		Scanner scanner = new Scanner(System.in);

		System.out.print("첫 번째 수 입력 >>");
		int num = scanner.nextInt();
		System.out.print("두 번째 수 입력 >>");
		int num2 = scanner.nextInt();

		int result_Add = num + num2;
		int result_Sub = num - num2;
		int result_Mul = num * num2;
		double result_Div = (double) num / num2;

		System.out.println(num + "과" + num2 + "의 합은 >>" + result_Add);
		System.out.println(num + "과" + num2 + "의 뺌은 >>" + result_Sub);
		System.out.println(num + "과" + num2 + "의 곱은 >>" + result_Mul);
		System.out.println(num + "과" + num2 + "의 나눔 >>" + result_Div);
	}

}
