import junit.framework.*;
import junit.swingui.TestRunner;

public class TestStatePatternTurnstyle extends TestCase
{
  public static void main(String[] args)
  {
    TestRunner.main(new String[]{"TestStatePatternTurnstyle"});
  }

  public TestStatePatternTurnstyle(String name)
  {
    super(name);
  }

  private Turnstyle t;
  private boolean lockCalled = false;
  private boolean unlockCalled = false;
  private boolean thankyouCalled = false;
  private boolean alarmCalled = false;


  public void setUp()
  {
    TurnstyleController controllerSpoof = new TurnstyleController()
    {
      public void lock() {lockCalled = true;}
      public void unlock() {unlockCalled = true;}
      public void thankyou() {thankyouCalled = true;}
      public void alarm() {alarmCalled = true;}
    };

    t = new Turnstyle(controllerSpoof);
  }

  public void testInitialConditions()
  {
    assertTrue(t.isLocked());
  }

  public void testCoinInLockedState()
  {
    t.setLocked();
    t.coin();
    assertTrue(t.isUnlocked());
    assertTrue(unlockCalled);
  }

  public void testCoinInUnlockedState()
  {
    t.setUnlocked();
    t.coin();
    assertTrue(t.isUnlocked());
    assertTrue(thankyouCalled);
  }

  public void testPassInLockedState()
  {
    t.setLocked();
    t.pass();
    assertTrue(t.isLocked());
    assertTrue(alarmCalled);
  }

  public void testPassInUnlockedState()
  {
    t.setUnlocked();
    t.pass();
    assertTrue(t.isLocked());
    assertTrue(lockCalled);
  }
}
