package ����;

import java.util.Scanner;

public class MemberMain {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		MemberMn mn = new MemberMn();
		ReservationMn reservationMn = new ReservationMn();

		int select = 0;
		MemberVO vo = null;
		boolean Reservation = false;

		System.out.println("==========�������� ���α׷�==========");
		do {
			System.out.println("[1]JOIN [2]LOGIN [3]END");
			select = scanner.nextInt();

			switch (select) {
			case 1:
				System.out.print("ID : ");
				String id = scanner.next();
				System.out.print("PW : ");
				String pw = scanner.next();
				System.out.print("DATE(2019-05-07) : ");
				String date = scanner.next();

				mn.join(new MemberVO(id, pw, date));
				System.out.println("���� ���� �Ϸ�");
				break;
			case 2:
				System.out.print("ID : ");
				String id2 = scanner.next();
				System.out.print("PW : ");
				String pw2 = scanner.next();

				vo = mn.login(new MemberVO(id2, pw2, null));

				if (vo == null) {
					System.out.println("Not Found! Please Join!");
				} else {
					System.out.println("Hello " + vo.getId());
				}
				break;
			}

			while (vo != null) {
				System.out.println("[1]Info [2]ModifyPW [3]Reservation [4]Logout");
				select = scanner.nextInt();

				switch (select) {
				case 1:
					System.out.println(vo);
					break;
				case 2:
					System.out.print("Pw �缳�� >> ");
					vo.setPw(scanner.next());

					vo = mn.Modify(vo);
					if (vo != null) {
						System.out.println("���� ������ �����Ͽ����ϴ�.");
					}
					break;
				case 3:
					Reservation = true;
					break;
				case 4:
					vo = null;
					break;
				}

				while (Reservation) {
					System.out.print("[1]���� [2]��ȸ [3]��� [4]������ >> ");
					select = scanner.nextInt();

					switch (select) {
					case 1:
						System.out.print("�¼����� S(1), A(2), B(3) >> ");
						int clas = scanner.nextInt();

						String[] arr = reservationMn.selectClass(clas - 1);
						switch (clas - 1) {
						case 0:
							System.out.print("S >> ");
							break;
						case 1:
							System.out.print("A >> ");
							break;
						case 2:
							System.out.print("B >> ");
							break;
						}

						for (int i = 0; i < arr.length; i++) {
							if (arr[i] == null) {
								System.out.print("--- ");
							} else {
								System.out.print(arr[i] + " ");
							}
						}
						System.out.println();

						System.out.print("�¼� ��ȣ >> ");
						int num = scanner.nextInt();

						if (arr[num - 1] == null) {
							arr[num - 1] = vo.getId();
							reservationMn.setclass(clas - 1, arr);
						} else {
							System.out.println("�̹� ����Ǿ��ִ� �ڸ��Դϴ�.");
						}

						break;
					case 2:
						String[][] arr_all = reservationMn.selectAllClass();
						for (int i = 0; i < arr_all.length; i++) {
							switch (i) {
							case 0:
								System.out.print("S >> ");
								break;
							case 1:
								System.out.print("A >> ");
								break;
							case 2:
								System.out.print("B >> ");
								break;
							}
							for (int j = 0; j < arr_all[i].length; j++) {
								if (arr_all[i][j] == null) {
									System.out.print("--- ");
								} else {
									System.out.print(arr_all[i][j] + " ");
								}
							}
							System.out.println();
						}
						break;
					case 3:
						System.out.print("�н����� >> ");
						String pw = scanner.next();

						if (vo.getPw().equals(pw)) {
							System.out.print("�¼����� S(1), A(2), B(3) >> ");
							int clas2 = scanner.nextInt();

							switch (clas2 - 1) {
							case 0:
								System.out.print("S >> ");
								break;
							case 1:
								System.out.print("A >> ");
								break;
							case 2:
								System.out.print("B >> ");
								break;
							}

							String[] arr2 = reservationMn.selectClass(clas2 - 1);

							for (int i = 0; i < arr2.length; i++) {
								if (arr2[i] == null) {
									System.out.print("--- ");
								} else {
									System.out.print(arr2[i] + " ");
								}
							}
							System.out.println();

							System.out.print("�¼� ��ȣ >> ");
							int num2 = scanner.nextInt();

							if (vo.getId().equals(arr2[num2 - 1])) {
								arr2[num2 - 1] = null;
							} else {
								System.out.println("���������� ��ġ���� �ʽ��ϴ�.");
							}
						} else {
							System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
						}
						break;
					case 4:
						Reservation = false;
						break;
					}
				}

			}
		} while (select != 3);

		System.out.println("============���α׷� ����============");
		scanner.close();
	}

}
