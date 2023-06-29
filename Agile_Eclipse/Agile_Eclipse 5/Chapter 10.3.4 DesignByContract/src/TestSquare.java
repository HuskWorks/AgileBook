
import junit.framework.TestCase;

public class TestSquare extends TestCase {

	public void testRectangle_DesignByContract() {
		Rectangle rectangle = new Square();
		double oldHeight = rectangle.GetHeight();
		rectangle.SetWidth(5);
		rectangle.SetHeight(4);
		assertEquals(true, (rectangle.GetWidth() == 5.0) && (rectangle.GetHeight() == oldHeight));
	}
}
