package ArrayList;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(8);
		list.add(1, 10);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		list.remove(2);
	}

}
