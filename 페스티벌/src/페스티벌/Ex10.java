package 페스티벌;

import java.util.Arrays;
/**
 * 
 * @author	: 오대근
 * @date	: 2019. 4. 30.
 * @time	: 오후 4:26:29
 * @content	: 난이도1
 *
 */
public class Ex10 {

	public static void main(String[] args) {
		int[][] arr1 = new int[5][5];
		int[][] arr2 = new int[5][5];
		
		int x = 1;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				arr1[i][j] = x++;
			}
		}
		
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				arr2[i][j] = arr1[4-i][4-j];
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
