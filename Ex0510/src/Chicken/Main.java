package Chicken;

public class Main {

	public static void main(String[] args) {
//		Super super1 = new Super();
//		super1.makeChicken();

		Super super2 = new Sub1();
		super2.makeChicken();
		((Sub1)super2).makeChicken2();
		
		Super super3 = new Sub2();
		super3.makeChicken();
		((Sub2)super3).makeChi();
	}

}
