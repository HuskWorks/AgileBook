
public class BigSquare extends Square {
	BigSquare(double side, Point topLeft) {
		itsSide = side;
		itsTopLeft = topLeft;
	}
	@Override
	void Draw() {
		System.out.println("=== Drawing Information for BigSquare ===");
		System.out.println("Side = " + itsSide);
		System.out.println("TopLeft (x, y) = (" + itsTopLeft.x + "," + itsTopLeft.y + ")");		
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
