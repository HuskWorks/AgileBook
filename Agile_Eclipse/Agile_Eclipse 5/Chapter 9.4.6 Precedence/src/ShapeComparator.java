public class ShapeComparator implements java.util.Comparator<Shape> {
	 public int compare(Shape shape1, Shape shape2) {
		 if (shape1.Preceeds(shape2)) {
			 return -1;
		 } else {
			 return 1;
		 }
	 }
}
