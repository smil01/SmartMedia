package picture;

public class Cir implements Shape {
	private String color;
	public Cir(String color) {
		this.color = color;
	}
	@Override
	public String getShape() {
		return "µµÇü : Cir / »ö±ò : " + color;		
	}
}
