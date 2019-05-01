package Arr;

public class Arr_ex03 {

	public static void main(String[] args) {
		int size = 7;
		int[][] arr = new int[size][size];

		int lv = 0;
		int count = 0;
		boolean set = true;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j <= (arr.length / 2) + lv && j >= (arr.length / 2) - lv) {
					arr[i][j] = ++count;
				}
			}

			if (set) {
				lv++;
			} else {
				lv--;
			}

			if (lv == arr.length / 2 && set) {
				set = false;
			}
		}
		
		
		int[][] arr2 = new int[size][size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr2[i][j] = arr[j][i];
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
