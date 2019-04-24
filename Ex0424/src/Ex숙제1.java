import java.util.Scanner;

/**
 * 
 * @author	: 오대근
 * @date	: 2019. 4. 24.
 * @time	: 오후 6:14:15
 * @content	: 숙제1
 *
 */
public class Ex숙제1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("값입력 >>");
		int num = scanner.nextInt();
		int result = num - (num%100);
		
		System.out.println("결과확인 >>" + result);
	}
}
