package ¼÷Á¦;

public class ReservationMn {
	private String[][] arr;

	public ReservationMn() {
		arr = new String[3][10];
	}
	
	public String[][] selectAllClass() {
		return arr;
	}
	
	public String[] selectClass(int clas) {
		return arr[clas];
	}
	
	public void setclass(int clas, String[] arr) {
		this.arr[clas] = arr;
	}
}
