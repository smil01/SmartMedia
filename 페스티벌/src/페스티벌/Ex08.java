package 페스티벌;

import java.util.Arrays;

/**
 * 
 * @author 	: 오대근
 * @date 	: 2019. 4. 30.
 * @time 	: 오후 4:00:58
 * @content : 난이도 1
 *
 */
public class Ex08 {

	public static int[] mergeArray(int[] arr, int[] arr2) {
		int[] arr3 = new int[arr.length + arr2.length];

		int j = 0;

		for (int i = 0; i < arr.length; i++, j++) {
			arr3[j] = arr[i];
		}

		for (int i = 0; i < arr2.length; i++, j++) {
			arr3[j] = arr2[i];
		}

		Arrays.sort(arr3);

		return arr3;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 8 };
		int[] b = { 2, 4, 9, 10 };
		int[] merge = mergeArray(a, b);
		System.out.println(Arrays.toString(merge));
	}

}
