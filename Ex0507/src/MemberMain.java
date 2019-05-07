import java.util.Scanner;

public class MemberMain {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		MemberMn mn = new MemberMn();

		int select = 0;
		MemberVO vo = null;

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
				System.out.println("[1]예약 [2]조회 [3]취소 [4]Info [5]ModifyPW [6]Logout");
				select = scanner.nextInt();

				switch (select) {
				case 4:
					System.out.println(vo);
					break;
				case 5:
					System.out.print("Pw 재설정 >> ");
					vo.setPw(scanner.next());

					vo = mn.Modify(vo);
					if (vo != null) {
						System.out.println("정보 수정에 성공하였습니다.");
					}
					break;
				case 6:
					vo = null;
					break;
				}

			}
		} while (select != 3);

		System.out.println("============프로그램 종료============");
		scanner.close();
	}
}
