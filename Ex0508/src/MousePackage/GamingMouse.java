package MousePackage;

public class GamingMouse extends WheelMouse {
	public void wClick() {
		super.click();
		this.click();
		System.out.println("WŬ��");
	}
	@Override
	public void click() {
		System.out.println("Ŭ��Ŭ��");
	}
}
