import java.util.Scanner;
/**
 * 
 * @author	: �����
 * @date	: 2019. 4. 25.
 * @time	: ���� 3:32:19
 * @content	: 3�׿���
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int result = num1>num2?num1-num2:num2-num1;
		
		System.out.println(result);
	}

}
