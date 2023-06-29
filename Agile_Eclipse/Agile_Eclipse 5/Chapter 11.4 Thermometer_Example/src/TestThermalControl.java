import junit.framework.TestCase;


public class TestThermalControl extends TestCase
{
  public void testThermalControl()
  {
	Thermometer thermometer = new Thermometer();
	thermometer.setTemperature(15);
	Furnace furnace = new Furnace(thermometer, true);
    ThermalControl.FURNACE = furnace;    
    ThermalControl.THERMOMETER = thermometer;       
    ThermalControl.Regulate(10, 30);
  }
}  