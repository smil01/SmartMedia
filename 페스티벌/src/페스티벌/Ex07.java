package 페스티벌;
/**
 * 
 * @author	: 오대근
 * @date	: 2019. 4. 30.
 * @time	: 오후 3:50:55
 * @content	: 난이도 1
 *
 */
public class Ex07 {
	
	public static int findKim(String[] arr) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals("Kim")) {
				return i + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String[] name = {"Qeskajdl", "sakdjsak", "Kim"};
		System.out.println("김서방은 "+ findKim(name) + "에 있습니다.");
	}

}
