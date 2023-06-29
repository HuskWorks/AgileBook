import junit.framework.TestCase;


public class TestButton extends TestCase
{
  public void testButton()
  {
	Lamp lamp = new Lamp();
    Button button = new Button(lamp);
    assertEquals("off", lamp.getStatus());    
    
	PowerModule.isOn = true;
    button.poll();
    assertEquals("on", lamp.getStatus());
  }
}