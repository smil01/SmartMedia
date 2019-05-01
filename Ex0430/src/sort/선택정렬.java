package sort;

public class 선택정렬 {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int x : arr) {
			System.out.print(x + "\t");
		}
	}

}
