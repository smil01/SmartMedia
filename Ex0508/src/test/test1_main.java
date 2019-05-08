package test;

public class test1_main {

	public static void main(String[] args) {
		String arr[][] = new String[4][11];

		arr[0][0] = "과목";
		arr[1][0] = "국어";
		arr[2][0] = "영어";
		arr[3][0] = "수학";

		int[] pint = {70, 60, 50};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (i == 0) {
					arr[i][j] = Integer.toString(j * 10);
				} else {
					arr[i][j] = (j <= pint[i-1] / 10) ? "* " : "";
				}
			}
		}
		
		String arr2[][] = new String[11][4];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = arr[arr2[i].length-1-j][i];
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
