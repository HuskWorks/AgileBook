
public abstract class Line {

	private Point itsP1;
	private Point itsP2;
	
	abstract double GetSlope();
	abstract double GetInstercept();  // Y Intercept
	abstract boolean IsOn(Point point);
	
	Line(Point p1, Point p2) {
		itsP1 = p1;
		itsP2 = p2;
	}
	
	Point GetP1() { return itsP1; }
	Point GetP2() { return itsP2; }
	
}
