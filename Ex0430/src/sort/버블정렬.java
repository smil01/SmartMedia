package sort;

public class �������� {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < (arr.length - 1) - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i : arr) {
			System.out.print(i + "\t");
		}
	}

}
