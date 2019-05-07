import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Phone phone = new Phone();
		Scanner scanner = new Scanner(System.in);

		int select = 0;
		phone.startPrint();
		do {
			phone.menuPrint();
			select = scanner.nextInt();

			switch (select) {
			case 1:
				phone.namePrint();
				String name = scanner.next();
				phone.agePrint();
				int age = scanner.nextInt();
				phone.numPrint();
				String num = scanner.next();

				phone.insertList(new PhoneVO(name, age, num));
				break;
			case 2:
				phone.listAll();
				phone.delPrint();
				int index = scanner.nextInt();

				phone.deleteList(index - 1);
				break;
			case 3:
				phone.searchPrint();
				String name2 = scanner.next();
				
				phone.search(name2);
				break;
			case 4:
				phone.listAll();
				break;
			}
		} while (select != 5);

		phone.endPrint();
		scanner.close();
	}

}
