
/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 27.
 * @time : 오후 4:39:45
 * @content : 완전수 (자기 자신을 제외한 약수의 합이 자기 자신이 나온 수를 완전수라고 한다.)
 *
 */
public class forEx06 {

	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}

			if (i == sum) {
				System.out.println(i);
			}
		}
	}

}
