public class ShapeComparator implements java.util.Comparator<Object> {
	 public int compare(Object shape1, Object shape2) {
		 if (((Shape)shape1).Preceeds((Shape)shape2)) {
			 return -1;
		 } else {
			 return 1;
		 }
	 }
}
