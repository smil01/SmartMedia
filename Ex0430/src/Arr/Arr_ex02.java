package Arr;

public class Arr_ex02 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int[][] arr2 = new int[5][5];
		
		int x = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = ++x;
			}
		}
		
//		for (int i = 0; i < arr2.length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//				arr2[i][j] = arr[j][i];
//			}
//		}
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(i % 2 == 0) {
					arr2[i][j] = arr[i][j];
				} else {
					arr2[i][j] = arr[i][4-j];
				}
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
