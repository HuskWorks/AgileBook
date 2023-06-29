public class ThermalControl {
	boolean ENGAGE = true;
	boolean DISENGAGE = false;

	static void Regulate(StrongThermometer t, Heater h, double minTemp, double maxTemp) {
		for(;;)
		{
			if (h.IsEngaged())
			{
				while (t.getTemperature() < maxTemp)
					wait(1);
				h.Disengage();
			} else {
				while (t.getTemperature() > minTemp)
					wait(1);
				h.Engage();
			}
		}
	}

	static void wait(int second) {
			long startTime = System.currentTimeMillis();
			while((System.currentTimeMillis() - startTime) < second*1000);
	}
	
}
