import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 25.
 * @time : 오후 5:54:06
 * @content : 숙제
 *
 */
public class Ex숙제 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("사려는 상품 갯수를 입력하세요");
		int count = scanner.nextInt();
		double discount = 0.9;
		int value = 10000;
		int total = 0;

		if (count > 10) {
			total = (int) (value * count * discount);
		} else {
			total = value * count;
		}

		System.out.println("가격은 " + total + "원 입니다");
	}

}
