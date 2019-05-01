package Æä½ºÆ¼¹ú;

public class Ex35 {

	public static char[] caesar(String arr, int num) {
		char[] arr_char = arr.toCharArray();

		for (int i = 0; i < arr_char.length; i++) {
			if (arr_char[i] != 32) {
				if (arr_char[i] < 91) {
					if (90 < arr_char[i] + num) {
						arr_char[i] = (char) (arr_char[i] + (num - 26));
					} else {
						arr_char[i] = (char) (arr_char[i] + num);
					}
				} else {
					if (122 < arr_char[i] + num) {
						arr_char[i] = (char) (arr_char[i] + (num - 26));
					} else {
						arr_char[i] = (char) (arr_char[i] + num);
					}
				}
			}
		}
		
		return arr_char;
	}

	public static void main(String[] args) {
		System.out.println(caesar("  z     Z", 4));
	}

}
