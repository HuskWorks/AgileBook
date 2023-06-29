
import junit.framework.TestCase;

public class TestSquare extends TestCase {
	
	public void testSquareWidth() {
		Square square = new Square();
		square.SetWidth(1);
		assertEquals(1.0, square.GetHeight());
		square.SetHeight(2);
		assertEquals(2.0, square.GetWidth());
	}
	
	public void testUtilityFunction_f() {
		Rectangle rectangle = new Square();
		Utility.f(rectangle);
		assertEquals(32.0, rectangle.GetHeight());
	}
	
	public void testUtilityFunction_g() {
		Rectangle rectangle = new Square();
		Utility.g(rectangle);
		assertEquals(20.0, rectangle.Area());
	}
}
