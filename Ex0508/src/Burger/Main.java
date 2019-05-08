package Burger;

public class Main {

	public static void main(String[] args) {
		Super s = new Super();
		s.bulgogi();

		Sub sub = new Sub();
		sub.bulgogi();
		sub.cheese();

		Super s2 = new Sub();
		s2.bulgogi();
		((Sub) s2).cheese();
	}

}
