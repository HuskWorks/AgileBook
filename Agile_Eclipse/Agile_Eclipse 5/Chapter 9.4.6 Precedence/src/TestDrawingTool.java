import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class TestDrawingTool extends TestCase {
	public void testDrawAllShapes() {
		Circle circle = new BigCircle(10, new Point(20,20));
		Square square = new BigSquare(50, new Point(10,10));
		DrawingTool drawingTool = new DrawingTool();
		List<Shape> shapeList = new ArrayList<Shape>();
		shapeList.add(square);
		shapeList.add(circle);
		drawingTool.DrawAllShapes(shapeList);
	}
	
	public void testPreceedes() {
		Circle circle = new BigCircle(10, new Point(20,20));
		Square square = new BigSquare(50, new Point(10,10));
		DrawingTool drawingTool = new DrawingTool();
		List<Shape> shapeList = new ArrayList<Shape>();
		shapeList.add(square);
		shapeList.add(circle);
		shapeList.add(square);
		shapeList.add(square);
		shapeList.add(square);
		shapeList.add(circle);
		shapeList.add(circle);
		drawingTool.DrawAllShapes(shapeList);		
	}
	
}
