public class ThermalControl {
	static boolean ENGAGE = true;
	static boolean DISENGAGE = false;
	static Thermometer THERMOMETER;
	static Furnace FURNACE;

	static void Regulate(double minTemp, double maxTemp) {
		for(;;)
		{
			if (FURNACE.getEngagementStatus())
			{
				while (in(THERMOMETER) < maxTemp)
					wait(1);
				out(FURNACE, DISENGAGE);
			} else {
				while (in(THERMOMETER) > minTemp)
					wait(1);
				out(FURNACE, ENGAGE);
			}
		}
	}
	
	static double in(Thermometer thermometer) {
		return thermometer.getTemperature();
	}
	
	static void out(Furnace furnace, boolean engagement) {
		furnace.engage(engagement);
	}
	
	static void wait(int second) {
			long startTime = System.currentTimeMillis();
			while((System.currentTimeMillis() - startTime) < second*1000);
	}
	
}
