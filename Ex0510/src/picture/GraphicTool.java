package picture;

import java.util.ArrayList;

public class GraphicTool {

	private ArrayList<Shape> list = new ArrayList<Shape>();

	public void allDraw() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getShape());
		}
	}

	public void addShape(Shape sh) {
		list.add(sh);
	}
}
