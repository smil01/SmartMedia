package MousePackage;

public class Main {

	public static void main(String[] args) {
//		Mouse mouse = new Mouse();
//		mouse.click();
//		mouse.rClick();
//		mouse.drag();
//
//		WheelMouse wheelMouse = new WheelMouse();
//		wheelMouse.click();
//		wheelMouse.rClick();
//		wheelMouse.drag();
//		wheelMouse.scroll();
		
//		GamingMouse gamingMouse = new GamingMouse();
//		gamingMouse.click();
//		gamingMouse.rClick();
//		gamingMouse.drag();
//		gamingMouse.scroll();
//		gamingMouse.wClick();
		
		Mouse m2 = new WheelMouse(); //�� �ɽ���
		Mouse m3 = new GamingMouse();
		
		((WheelMouse)m2).scroll(); // �ٿ��ɽ���
		((GamingMouse)m3).scroll();

		m2.scroll(); // ������
	}

}
