package Arr;

public class Arr_ex04 {

	public static void main(String[] args) {
		int size = 5;
		char[][] arr = new char[size][size];
		Print p = new Print();

		int start = 0, end = size - 1, count = 0;

		for (int i = 0; i < size; i++) {
			for (int j = start; j <= end; j++) {
				arr[i][j] =  (char) (64 + ++count);
			}
			if (i >= (size / 2)) {
				start--;
				end++;
			} else {
				start++;
				end--;
			}
			p.print(arr);
		}

	}

}
