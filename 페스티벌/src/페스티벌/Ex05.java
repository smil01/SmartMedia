package 페스티벌;

public class Ex05 {

	public static String change124(int n) { // 함수를 만들때 static을 꼭 써야지 main에서 호출가능 이유가 알고싶다면 저에게 오세요.
		String answer = "";
        int[] arr = {4, 1, 2}; // 반복수
        int a; // 중복해서 쓸 수
        while (n > 0) {
            a = n % 3; // 3으로 나누고 나머지를 첫번째 숫자로 씀
            n = n / 3; // 그 다음 자리수 결정을 위한 중복수 처리과정
            if (a == 0) {
                n -= 1;
            }
            answer = arr[a] + answer;
        }
        return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(change124(10));
	}

}
