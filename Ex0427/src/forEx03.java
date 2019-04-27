import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 27.
 * @time : 오후 3:26:54
 * @content : 약수 구하기
 *
 */
public class forEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 >>");
		int num = sc.nextInt();
		System.out.print(num + "의 약수 ");

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}

}
