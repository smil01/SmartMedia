package MousePackage;

public class GamingMouse extends WheelMouse {
	public void wClick() {
		super.click();
		this.click();
		System.out.println("W클릭");
	}
	@Override
	public void click() {
		System.out.println("클릭클릭");
	}
}
