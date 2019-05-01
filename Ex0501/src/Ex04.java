
public class Ex04 {

	public static void main(String[] args) {
		// getDivisor(10);
		// getDivisor(16);
		// getDivisor(24);

		int num = 10;
		int result = getSumOfDivisors(num);
		
		System.out.println(num + "의 약수의 합 : " + result);
		
		getDivisor(num);
	}

	public static void getDivisor(int num) {
		System.out.print(num + "의 약수 : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static int getSumOfDivisors(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
