
public abstract class LinearObject {

	private Point itsP1;
	private Point itsP2;
	
	abstract boolean IsOn(Point point);
	
	LinearObject(Point p1, Point p2) {
		itsP1 = p1;
		itsP2 = p2;
	}
	
	double GetInstercept() { // Y Intercept
		double y0 = GetP1().y - GetSlope() * GetP1().x;
		return y0;
	}

	double GetSlope() {
		double slope = (GetP1().x - GetP2().x)/(GetP1().y - GetP2().y);
		return slope;
	}
	
	Point GetP1() { return itsP1; }
	Point GetP2() { return itsP2; }
	
}
