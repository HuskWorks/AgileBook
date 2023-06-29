import junit.framework.TestCase;


public class TestThermalControl extends TestCase
{

  public void testThermalControl() {
    StrongThermometer thermometer = new StrongThermometer();
    thermometer.setTemperature(15);
    Furnace furnace = new Furnace(thermometer, true);

    ThermalControl<Thermometer, Heater> tc = new ThermalControl<Thermometer, Heater>();
    tc.Regulate(thermometer, furnace, 10, 30);
  }
}  