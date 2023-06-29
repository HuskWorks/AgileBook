
import junit.framework.TestCase;

public class TestDrawingTool extends TestCase {
	
	public void testDrawShape() {
		Circle circle = new BigCircle(10, new Point(20,20));
		Square square = new BigSquare(50, new Point(10,10));
		DrawingTool drawingTool = new DrawingTool();
		drawingTool.DrawShape(square);
		drawingTool.DrawShape(circle);
	}
	
}
