import junit.framework.TestCase;


public class TestTimedDoor extends TestCase
{

  public void testThermalControl() {
    Timer timer = new SecondTimer();
    TimedDoor timedDoor = new TimedDoor(false);
    timer.Register(3, timedDoor);
    wait(5);
  }
  
  void wait(int second) {
	  long startTime = System.currentTimeMillis();
	  while((System.currentTimeMillis() - startTime) < second*1000);
  }
	
}  