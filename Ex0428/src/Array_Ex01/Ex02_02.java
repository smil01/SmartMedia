package Array_Ex01;

public class Ex02_02 {

	public static void main(String[] args) {
		int[] intArray = new int[20];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;

			if (intArray[i] % 2 == 0) {
				System.out.print(intArray[i] + " ");
			}
		}

	}

}
