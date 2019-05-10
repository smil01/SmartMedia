package picture;

public class Tri implements Shape {
	private String color;
	public Tri(String color) {
		this.color = color;
	}
	@Override
	public String getShape() {
		return "µµÇü : Tri / »ö±ò : " + color;		
	}
}
