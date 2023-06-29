public abstract class Square extends Shape {
	double itsSide;
	Point itsTopLeft;
	abstract void Draw();
	String getType() { return "square"; };
}
