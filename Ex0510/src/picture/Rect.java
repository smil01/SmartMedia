package picture;

public class Rect implements Shape {
	private String color;
	public Rect(String color) {
		this.color = color;
	}
	@Override
	public String getShape() {
		return "µµÇü : Rect / »ö±ò : " + color;		
	}
}
