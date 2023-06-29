import junit.framework.TestCase;

public class TestDegenerateFunctions extends TestCase {

  public void testDerived()
  {
    Base base = new Derived();
    assertEquals("derived", base.f()); // It's not "base" !
  }
  
}