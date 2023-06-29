public abstract class Circle extends Shape {
	double itsRadious;
	Point itsCenter;
	abstract void Draw();
	String getType() { return "circle"; };
}
