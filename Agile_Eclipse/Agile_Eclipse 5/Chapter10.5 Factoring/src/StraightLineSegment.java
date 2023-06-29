
public class StraightLineSegment extends LineSegment {

	StraightLineSegment(Point p1, Point p2) {
		super(p1, p2);
	}

	@Override
	double GetLength() {
		double length = Math.sqrt(Math.pow(GetP1().x - GetP2().x, 2) + Math.pow(GetP1().y - GetP2().y, 2));
		return length;
	}

	@Override
	boolean IsOn(Point point) {
		if ( (GetSlope() * (point.x - GetP1().x)) != (point.y - GetP1().y) ) {
			return false;
		} else if ( (GetLength(point, GetP1()) <= GetLength()) && (GetLength(point, GetP2()) <= GetLength()) ) {
			return true;
		}
		return false;
	}

	@Override
	double GetInstercept() {
		double y0 = 999999;
		if ( (GetP1().x <= 0) && (GetP2().x >= 0) || (GetP2().x <= 0) && (GetP1().x >= 0) ) {
			y0 = GetP1().y - GetSlope() * GetP1().x;
		}
		return y0;
	}

	@Override
	double GetSlope() {
		double slope = (GetP1().x - GetP2().x)/(GetP1().y - GetP2().y);
		return slope;
	}
	
	double GetLength(Point p1, Point p2) {
		double length = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
		return length;
	}

}
