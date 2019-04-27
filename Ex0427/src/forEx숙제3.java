
public class forEx¼÷Á¦3 {

	public static void main(String[] args) {
		for (int i = 0, j = 0; i <= 10; i++) {
			for (int k = 0; k <= j + (5 - j) * 2 + 1; k++) {

				System.out.print((k <= j) ? " " : "*");

			}
			System.out.println();
			if (i < 5) {
				j++;
			} else {
				j--;
			}
		}
	}

}
