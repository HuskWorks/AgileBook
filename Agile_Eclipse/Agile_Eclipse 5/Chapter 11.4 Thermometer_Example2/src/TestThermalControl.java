import junit.framework.TestCase;


public class TestThermalControl extends TestCase
{

  public void testThermalControl() {
    StrongThermometer thermometer = new StrongThermometer();
    thermometer.setTemperature(15);
    Furnace furnace = new Furnace(thermometer, true);

    ThermalControl.Regulate(thermometer, furnace, 10, 30);
  }
}  