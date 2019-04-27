import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 27.
 * @time : 오후 4:24:13
 * @content : 소수 구하기
 *
 */
public class forEx08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구간 입력 >>");
		int num = scanner.nextInt(), num2 = scanner.nextInt();
		
		for (int i = num; i <= num2; i++) {
			boolean val = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					val = false;
					break;
				}
			}
			if (val) {
				System.out.print(i + " ");
			}
		}
	}

}
