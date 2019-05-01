

/**
 * 
 * @author : 오대근
 * @date : 2019. 5. 1.
 * @time : 오전 9:49:11
 * @content : 2차원 배열 출력 함수
 *
 */
public class Print {
	private int count = 1;

	public void print(String[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("======================↑" + count++ + "번째" + "↑=====================");
	}

	public void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("======================↑" + count++ + "번째" + "↑=====================");
	}

	public void print(float[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("======================↑" + count++ + "번째" + "↑=====================");
	}

	public void print(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("======================↑" + count++ + "번째" + "↑=====================");
	}

	public void print(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("======================↑" + count++ + "번째" + "↑=====================");
	}

	public void print(Boolean[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("======================↑" + count++ + "번째" + "↑=====================");
	}

	public void print(String[] arr) {
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + "\t");

		}
		System.out.println("======================↑" + count++ + "번째" + "↑=====================");
	}

	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + "\t");

		}
		System.out.println("======================↑" + count++ + "번째" + "↑=====================");
	}

	public void print(float[] arr) {
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + "\t");

		}
		System.out.println("======================↑" + count++ + "번째" + "↑=====================");
	}

	public void print(double[] arr) {
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + "\t");

		}
		System.out.println("======================↑" + count++ + "번째" + "↑=====================");
	}

	public void print(char[] arr) {
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + "\t");

		}
		System.out.println("======================↑" + count++ + "번째" + "↑=====================");
	}

	public void print(Boolean[] arr) {
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + "\t");

		}
		System.out.println("======================↑" + count++ + "번째" + "↑=====================");
	}
}
