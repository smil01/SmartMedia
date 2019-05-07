package 숙제;

import java.util.Scanner;

public class MemberMain {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		MemberMn mn = new MemberMn();
		ReservationMn reservationMn = new ReservationMn();

		int select = 0;
		MemberVO vo = null;
		boolean Reservation = false;

		System.out.println("==========공연예약 프로그램==========");
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
				System.out.println("계정 생성 완료");
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
					System.out.print("Pw 재설정 >> ");
					vo.setPw(scanner.next());

					vo = mn.Modify(vo);
					if (vo != null) {
						System.out.println("정보 수정에 성공하였습니다.");
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
					System.out.print("[1]예약 [2]조회 [3]취소 [4]끝내기 >> ");
					select = scanner.nextInt();

					switch (select) {
					case 1:
						System.out.print("좌석구분 S(1), A(2), B(3) >> ");
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

						System.out.print("좌석 번호 >> ");
						int num = scanner.nextInt();

						if (arr[num - 1] == null) {
							arr[num - 1] = vo.getId();
							reservationMn.setclass(clas - 1, arr);
						} else {
							System.out.println("이미 예약되어있는 자리입니다.");
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
						System.out.print("패스워드 >> ");
						String pw = scanner.next();

						if (vo.getPw().equals(pw)) {
							System.out.print("좌석구분 S(1), A(2), B(3) >> ");
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

							System.out.print("좌석 번호 >> ");
							int num2 = scanner.nextInt();

							if (vo.getId().equals(arr2[num2 - 1])) {
								arr2[num2 - 1] = null;
							} else {
								System.out.println("예약정보가 일치하지 않습니다.");
							}
						} else {
							System.out.println("비밀번호가 일치하지 않습니다.");
						}
						break;
					case 4:
						Reservation = false;
						break;
					}
				}

			}
		} while (select != 3);

		System.out.println("============프로그램 종료============");
		scanner.close();
	}

}
