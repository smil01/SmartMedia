package �佺Ƽ��;
/**
 * 
 * @author	: �����
 * @date	: 2019. 4. 30.
 * @time	: ���� 5:25:29
 * @content	: ���̵�1
 *
 */
public class Ex13 {

	public static void main(String[] args) {
		String score = "A, B, C, D, F, A, A, A";

		int a = 0, b = 0, c = 0, d = 0, f = 0;

		for (int i = 0; i < score.length(); i++) {
			switch (score.charAt(i)) {
			case 'A':
				a++;
				break;
			case 'B':
				b++;
				break;
			case 'C':
				c++;
				break;
			case 'D':
				d++;
				break;
			case 'F':
				f++;
				break;
			}
		}
		
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		System.out.println("C : " + c);
		System.out.println("D : " + d);
		System.out.println("F : " + f);
	}

}
