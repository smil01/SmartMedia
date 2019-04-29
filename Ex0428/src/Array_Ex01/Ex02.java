package Array_Ex01;

public class Ex02 {

	public static void main(String[] args) {
//		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[] intArray = new int[20];
		for (int i = 0; i < 20; i++) {
			intArray[i] = i + 1;
		}

		System.out.print("intArray에 있는 짝수는 : ");
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 2 == 0) {
				System.out.print(intArray[i] + " ");
			}
		}
		System.out.println("입니다.");
	}

}
