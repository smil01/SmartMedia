
public class forEx¼÷Á¦2 {

	public static void main(String[] args) {
		for (int i = 0, j = 0; i < 9; i++) {
			for (int k = 0; k < j + 5; k++) {
				System.out.print((k < (4 - j)) ? " " : "*");
			}
			if (i < 4) {
				j++;
			} else {
				j--;
			}
			System.out.println();
		}

	}

}
