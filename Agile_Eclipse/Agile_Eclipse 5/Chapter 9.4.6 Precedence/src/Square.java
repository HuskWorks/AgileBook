public abstract class Square extends Shape {
	double itsSide;
	Point itsTopLeft;
	abstract void Draw();
	abstract boolean Preceeds(Shape shape);
}
