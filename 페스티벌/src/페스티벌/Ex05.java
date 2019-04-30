package 페스티벌;

public class Ex05 {

	public static String change124(int n) { // 함수를 만들때 static을 꼭 써야지 main에서 호출가능 이유가 알고싶다면 저에게 오세요.
		String answer = "";
        int[] arr = {4, 1, 2};
        int a;
        while (n > 0) {
            a = n % 3;
            n = n / 3;
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
