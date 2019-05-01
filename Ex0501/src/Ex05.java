
public class Ex05 {

	public static void getPerfectNumber(int s, int e) {
		System.out.print(s + " ~ " + e + "까지의 완전수 : ");
		for (int i = s; i <= e; i++) {
			int sum = getSumOfDivisors(i);

			if (sum == i) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
	
	public static int getSumOfDivisors(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
	}

}
