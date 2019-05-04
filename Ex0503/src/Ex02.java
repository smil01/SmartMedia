import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		int val = serchArr(arr);

		System.out.println(val == -1 ? "존재하지 않습니다." : val + 1 + "번째 있습니다.");
	}

	private static int serchArr(int[] arr) {
		int start = 0;
		int mid = arr.length / 2;
		int end = arr.length - 1;
		int target = 11;
		
		while (true) {
			if (mid == arr.length|| mid == -1) {
				return -1;
			} else if (arr[mid] == target) {
				return mid+1;
			} else if (arr[mid] < target) {
				start = mid+1;
			} else if (arr[mid] > target) {
				end = mid-1;
			}
			mid = start + ((end - start) / 2);
		}
	}
}