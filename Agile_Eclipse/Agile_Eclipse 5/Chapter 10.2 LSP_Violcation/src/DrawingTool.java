
public class DrawingTool {

	void DrawShape(Shape shape) {
		if (shape.itsType.equals("square")) {
			((Square)shape).Draw();
		} else if (shape.itsType.equals("circle")) {
			((Circle)shape).Draw();
		}
	}
}
