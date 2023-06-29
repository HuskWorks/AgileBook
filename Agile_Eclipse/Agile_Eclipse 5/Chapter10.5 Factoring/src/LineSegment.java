
public abstract class LineSegment extends Line {
	
	abstract double GetLength();
	abstract boolean IsOn(Point point);
	
	LineSegment(Point p1, Point p2) {
		super(p1, p2);
	}

}
