package Æä½ºÆ¼¹ú;

public class Ex24 {

	public static char[] reverseStr(String arr) {
		char[] arr_char = arr.toCharArray();
		
		for (int i = 0; i < arr_char.length - 1; i++) {
			for (int j = i + 1; j < arr_char.length; j++) {
				if (arr_char[i] > arr_char[j]) {
					char temp = arr_char[i];
					arr_char[i] = arr_char[j];
					arr_char[j] = temp;
				}
			}
		}
		
		return arr_char;
	}

	public static void main(String[] args) {
		System.out.println(reverseStr("ZAbcdVefEg"));
	}

}
