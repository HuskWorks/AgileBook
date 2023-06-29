import java.util.List;

public class DrawingTool {
	public void DrawAllShapes(List<Shape> shapeList){
		for (Shape shape : shapeList) {
			shape.Draw();
		}
	}
}
