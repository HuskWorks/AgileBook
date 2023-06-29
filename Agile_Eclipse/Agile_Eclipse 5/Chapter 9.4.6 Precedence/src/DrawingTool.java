import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrawingTool {

	void DrawAllShapes(List<Shape> shapeList){
		List<Shape> orderedList = DrawingOrderSort(shapeList);
		for (Shape shape : orderedList) {
			shape.Draw();
		}
	}
	
	List<Shape> DrawingOrderSort(List<Shape> shapeList) {
		  List<Shape> orderedList = new ArrayList<Shape>(shapeList);
		  Collections.sort(orderedList, new ShapeComparator());
		  return orderedList;
	}
}
