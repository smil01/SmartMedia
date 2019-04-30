package 파트너시험;

import java.util.Random;
import java.util.Scanner;

public class InfinityStone2 {
	public static void main(String[] args) {
		System.out.println("인피니티 스톤을 찾아 나서자");

		while (true) {

			System.out.println("[1]스페이스스톤 [2]파워스톤 [3]마인드스톤 [4]타임스톤 [5]리얼리티스톤  [6]종료");

			int choice = new Scanner(System.in).nextInt();

			if (choice == 1) {
				System.out.println("로키 : 스페이스스톤을 얻기위해서는... 배열의 공간을 활용할 줄 알아야한다... ");
				int[] array = { 1, 2, 3, 4, 5 };
				System.out.println("로키 : int[] array : {1,2,3,4,5} 배열을 생성 후에... 끝에서 부터 출력하면");
				System.out.println("로키 : 스페이스 스톤을 차지할 수 있을 것이다...");
				System.out.print("결과 ->int[] array : {");
				for (int i = 0; i <= 3; i++) {
					array[i] = 5 - i;
					System.out.print(array[i] + ",");
					if (i == 3) {
						array[i + 1] = i - 2;
						System.out.print(array[i + 1]);
					}
				}
				System.out.print("}");
				System.out.println();

			} else if (choice == 2) {
				// 가위바위보 배열 랜덤 넣고
				System.out.println("로난 : 파워스톤을 얻기위해서는... 컴퓨터와의 정면승부에서 이겨야 한다... ");
				System.out.println("로난 : 컴퓨터와의 가위바위보를 하여 이겨라");
				System.out.println("로난 : 3번 먼저 승리한다면 파워 스톤을 차지할 수 있을 것이다...");

				int cntCom = 0;
				int cntUser = 0;

				String[] rsp = { "가위", "바위", "보" };

				Random rd = new Random();
				Scanner sc = new Scanner(System.in);
				while (true) {
					int com = rd.nextInt(3);

					System.out.print("가위, 바위, 보 중 하나를 입력해라 >> ");
					String user = sc.nextLine();

					System.out.println("com : " + rsp[com] + ", user : " + user);
					if (user.equals(rsp[com])) {
						System.out.println("무승부");
					} else if (user.equals("가위") && com == 1) {
						cntCom += 1;
						System.out.println("나의 " + cntCom + "승!");
					} else if (user.equals("가위") && com == 2) {
						cntUser += 1;
						System.out.println("당신의 " + cntUser + "승!");
					} else if (user.equals("바위") && com == 2) {
						cntCom += 1;
						System.out.println("나의 " + cntCom + "승!");
					} else if (user.equals("바위") && com == 0) {
						cntUser += 1;
						System.out.println("당신의 " + cntUser + "승!");
					} else if (user.equals("보") && com == 0) {
						cntCom += 1;
						System.out.println("나의 " + cntCom + "승!");
					} else if (user.equals("보") && com == 1) {
						cntUser += 1;
						System.out.println("당신의 " + cntUser + "승!");
					} else {
						cntCom += 1;
						System.out.println("나의 " + cntCom + "승!");
					}

					if (cntCom == 3) {
						System.out.println("아직 이르다 애송이..");
						break;
					} else if (cntUser == 3) {
						System.out.println("파워스톤을 가질 자격이 충분하다...");
						break;
					}
				}
			} else if (choice == 3) {
				// 업다운 게임
				System.out.println("치타우리 셉터 : 마인드스톤을 얻기위해서는... 컴퓨터가 낸 숫자를 알아야한다... ");
				System.out.println("치타우리 셉터 : 컴퓨터가 낸 숫자를 추측하여 컴퓨터의 숫자를 맞추어라");
				System.out.println("치타우리 셉터 : 5회안에 숫자를 맞춘다면 마인드스톤을 얻을 수 있으리...\n");
				int answer = 0;
				Random random = new Random();
				int answerNumber = random.nextInt(99) + 1;

				int bool = 0;
				for (int i = 1; i <= 5; i++) {
					System.out.print("숫자를 입력해라..크큭(1~99) : ");
					answer = new Scanner(System.in).nextInt();
					if (answer > answerNumber) {
						if (i == 5) {
							continue;
						}
						System.out.println("Down!");
						System.out.println("목숨이 " + (5 - i) + "개 남았다..");
					} else if (answer < answerNumber) {
						if (i == 5) {
							continue;
						}
						System.out.println("Up!");
						System.out.println("목숨이 " + (5 - i) + "개 남았다..");
					} else if (answer == answerNumber) {
						System.out.println("마인드 스톤이 널 선택하는 군..");
						bool = 1;
						break;
					}
				}
				if (bool == 0) {
					System.out.println("마인드 스톤을 차지하지 못했다..");
				}

			} else if (choice == 4) {
				// 시분초 계산
				// 초단위 시간 입력시 변경완료
				System.out.println("에인션트 원 : 타임스톤을 얻기위해서는... 시간을 활용할 줄 알아야한다... ");
				System.out.println("에인션트 원 : 초단위를 입력받은후 초를 시간과 분과 초로 바꿀줄 안다면");
				System.out.println("에인션트 원 : 타임스톤을 차지할 수 있을 것이다...");

				Scanner sc = new Scanner(System.in);
				System.out.print("초를 입력해라 : ");
				int second = sc.nextInt();
				int hour = second / 3600;
				int min = (second - (hour * 3600)) / 60;
				int re_Second = (second - (hour * 3600)) % 60;
				System.out.println(hour + "시" + min + "분" + re_Second + "초");

				System.out.println("시간을 가질 자격이 충분하다... 어서 도르마무 다크디멘션으로 부터 우릴 지켜줘...");

			} else if (choice == 5) {
				// 이등변 삼각형
				System.out.println("콜렉터 : 리얼리티스톤을 얻기위해서는... 내가 뽑은 숫자 만큼 행의 삼각형을 만들어야 한다.. ");
				System.out.println("콜렉터 : 랜덤 숫자를 뽑은 후(1 ~ 10) 그 숫자만큼 별 삼각형을 만든다면...");
				System.out.println("콜렉터 : 리얼리티스톤을 차지할 수 있을 것이다...");
				System.out.println("콜렉터 : 반복문을 잘 못 사용한다면 무한루프에 빠질지도 모른다굿!");

				Random rd = new Random();
				int num = rd.nextInt(10) + 1;

				
				System.out.println("콜렉터가 뽑은 숫자 >>" + num);
				for (int i = 0, j = 0; i < num; i++) {
					for (int k = 0; k < j + num; k++) {
						System.out.print((k < ((num - 1) - j)) ? " " : "*");
					}
					if (i < (num - 1)) {
						j++;
					} 
					System.out.println();
				}

				System.out.println("짝짝짝! 완벽하군");

			} else if (choice == 6) {
				System.out.println("모든 스톤 모으기는 끝이 났다...");
				break;
			} else {
				System.out.println("엔트맨 : 정확한 숫자를 입력하지 않는다면 양자영역에 갇힐지도 몰라...!");

			}

		}

	}

}