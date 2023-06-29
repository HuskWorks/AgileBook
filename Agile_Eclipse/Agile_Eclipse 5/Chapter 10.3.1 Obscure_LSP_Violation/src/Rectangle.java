
public class Rectangle {
	
	void SetWidth(double w) {itsWidth=w;}
	void SetHeight(double h) {itsHeight=h;}
	double GetHeight() {return itsHeight;}
	double GetWidth() {return itsWidth;}
	double Area() {return itsWidth*itsHeight;};
	
	private Point itsTopLeft;
	private double itsWidth;
	private double itsHeight;
}
