import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrawingTool {

	void DrawAllShapes(List<Shape> shapeList){
		List<Shape> orderedList = DrawingOrderSort(shapeList);
		for (Shape shape : orderedList) {
			shape.Draw();
		}
	}
	
	List<Shape> DrawingOrderSort(List<Shape> shapeList) {
		  Object[] shapes = shapeList.toArray();
		  Arrays.sort(shapes, new ShapeComparator());
		  List<Shape> orderedList = new ArrayList<Shape>();
		  for (Object shape : shapes) {
			  orderedList.add((Shape)shape);
		  }
		  return orderedList;
	}
}
