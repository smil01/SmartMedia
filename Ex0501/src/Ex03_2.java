
public class Ex03_2 {

	public static void main(String[] args) {
		int num = 9;
		int num2 = 2;
		
		System.out.println(isDivisor(num, num2));
	}
	
	public static boolean isDivisor(int num, int num2) {
		if(num % num2 == 0) {
			return true;
		}
		return false;
	}

}
