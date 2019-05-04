import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int size = 5, val = 0; // 배열 길이, 몇번째에 있는지 담을 변수
		String[] arr = new String[size]; // 배열 선언
		String search = null; // 찾을 단어

		arr = inputArr(size, scanner); // 배열에 값 입력받기
		search = input(scanner); // 찾을 단어 입력받기
		val = search(arr, search); // 검색
		
		serchIf(search, val); // 결과 출력
		
		scanner.close();
	}

	private static String[] inputArr(int size, Scanner scanner) {
		String[] arr = new String[size];

		System.out.println("이름 5개를 입력하시오.");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 입력 >> ");
			arr[i] = scanner.nextLine();
		}
		return arr;
	}

	private static String input(Scanner scanner2) {
		String search = null;

		System.out.print("찾고 싶은 사람을 입력하시오. >> ");
		search = scanner2.nextLine();

		return search;
	}

	private static int search(String[] arr, String search) {
		int val = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(search)) {
				val = i + 1;
			}
		}
		return val;
	}

	private static void serchIf(String search, int val) {
		System.out.println(val == -1 ? "존재하지 않습니다." : search + "는 " + val + "에 있습니다.");
	}

}
