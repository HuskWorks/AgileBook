
public abstract class Ray extends LinearObject {

	Ray(Point p1, Point p2) {
		super(p1, p2);
	}

	abstract boolean IsOn(Point point);

}
