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
		
		Mouse m2 = new WheelMouse(); //업 케스팅
		Mouse m3 = new GamingMouse();
		
		((WheelMouse)m2).scroll(); // 다운케스팅
		((GamingMouse)m3).scroll();

		m2.scroll(); // 재정의
	}

}
