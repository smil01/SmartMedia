package Arr;

public class Arr_ex03_02 {

	public static void main(String[] args) {
		int size = 5;
		int[][] arr = new int[size][size];
		Print p = new Print();

		int start = size / 2, end = size / 2, count = 0;

		for (int i = 0; i < size; i++) {
			for (int j = start; j <= end; j++) {
				arr[i][j] = ++count;
			}
			if (i >= (size / 2)) {
				start++;
				end--;
			} else {
				start--;
				end++;
			}
			p.print(arr);
		}
		
		
	}

}
