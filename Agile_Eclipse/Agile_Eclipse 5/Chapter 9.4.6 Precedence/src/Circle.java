public abstract class Circle extends Shape {
	double itsRadious;
	Point itsCenter;
	abstract void Draw();
	abstract boolean Preceeds(Shape shape);
}
