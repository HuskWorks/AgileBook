
public class BigCircle extends Circle {

	BigCircle(double radious, Point center) {
		itsRadious = radious;
		itsCenter = center;
	}
	@Override
	void Draw() {
		System.out.println("=== Drawing Information for BigCircle ===");
		System.out.println("Radious = " + itsRadious);
		System.out.println("Center (x, y) = (" + itsCenter.x + "," + itsCenter.y + ")");		
	}
	@Override
	boolean Preceeds(Shape shape) {
		if (shape instanceof Square) {
			return true;
		} else {
			return false;
		}
	}

}
