
public class StraightLine extends Line {

	StraightLine(Point p1, Point p2) {
		super(p1, p2);
	}

	@Override
	double GetInstercept() {
		double y0 = GetP1().y - GetSlope() * GetP1().x;
		return y0;
	}

	@Override
	double GetSlope() {
		double slope = (GetP1().x - GetP2().x)/(GetP1().y - GetP2().y);
		return slope;
	}

	@Override
	boolean IsOn(Point point) {
		return (GetSlope() * (point.x - GetP1().x) == (point.y - GetP1().y));
	}

}
