
import junit.framework.TestCase;

public class TestAboutLines extends TestCase {
	
	public void testLineGetSlope() {
		Line line = new StraightLine(new Point(1,2), new Point(3,4));
		assertEquals(1.0, line.GetSlope());
	}
	
	public void testLineGetIntercept() {
		Line line = new StraightLine(new Point(1,2), new Point(3,4));
		assertEquals(1.0, line.GetInstercept());
	}
	
	public void testLineIsOn() {
		Line line = new StraightLine(new Point(1,2), new Point(3,4));
		assertEquals(true, line.IsOn(new Point(2,3)));
	}
	
	public void testLineSegmentGetSlope() {
		Line lineSeg = new StraightLineSegment(new Point(1,2), new Point(3,4));
		assertEquals(1.0, lineSeg.GetSlope());
	}
	
	public void testLineSegmentGetIntercept() {
		Line lineSeg = new StraightLineSegment(new Point(-1,0), new Point(3,4));
		assertEquals(1.0, lineSeg.GetInstercept());
	}
	
	public void testLineSegmentIsOn() {
		Line lineSeg = new StraightLineSegment(new Point(1,2), new Point(3,4));
		assertEquals(true, lineSeg.IsOn(new Point(2,3)));
	}
	
}
