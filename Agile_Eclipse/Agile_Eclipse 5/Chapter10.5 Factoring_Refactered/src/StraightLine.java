
public class StraightLine extends Line {

	StraightLine(Point p1, Point p2) {
		super(p1, p2);
	}

	@Override
	boolean IsOn(Point point) {
		return (GetSlope() * (point.x - GetP1().x) == (point.y - GetP1().y));
	}

}
