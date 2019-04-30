package 페스티벌;

/**
 * 
 * @author	: 오대근
 * @date	: 2019. 4. 30.
 * @time	: 오후 2:03:17
 * @content	: 난이도 2
 *
 */
public class Ex02 {

	public static void main(String[] args) { // 메서드 사용법 도저히 모르겠으면 저에게 오세요. 친절하게 설명해드립니다.
		int number = CollatzNumber(6);
		System.out.println(number);
	}

	public static int CollatzNumber(int num) { // 함수를 만들때 static을 꼭 써야지 main에서 호출가능 이유가 알고싶다면 저에게 오세요.
		int count = 0; // 카운트용
		while (num != 1) { // num이 1이 되면 자동종료 조건
			count++;
			if (num % 2 == 0) { // 짝수 조건
				num = num / 2; // /=로 수식을 바꿔도 됨
			} else { // 홀수조건
				num = num * 3 + 1; // 이건 수식 바꾸면 안됨
			}
		}
		return count;
	}

}
