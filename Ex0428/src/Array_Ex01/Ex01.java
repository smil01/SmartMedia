package Array_Ex01;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 29.
 * @time : 오후 3:32:02
 * @content : 배열
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		// int[] intArray;
		// intArray = new int[5];
		int[] intArray = new int[5];
		// int[] intArray = {1, 2, 3, 4, 5, 6, 7};

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
		}

		System.out.println(intArray.length);
	}

}
