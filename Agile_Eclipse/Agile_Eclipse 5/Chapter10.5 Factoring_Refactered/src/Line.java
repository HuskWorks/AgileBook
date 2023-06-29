
public abstract class Line extends LinearObject {

	abstract boolean IsOn(Point point);
	
	Line(Point p1, Point p2) {
		super(p1, p2);
	}
	
}
