
public class Furnace implements Runnable {
	
	Thermometer itsThermometer;
	boolean isEngaged;
	
	Furnace(Thermometer thermometer, boolean engagement) {
		itsThermometer = thermometer;
		isEngaged = engagement;
	    Thread t = new Thread(this);
	    t.start();
	}
	
	public void engage(boolean engagement) {
		isEngaged = engagement;
	}
	
	public boolean getEngagementStatus() {
		return isEngaged;
	}

	public void run() {
		for(;;) {
			sleep(1000);
			if (isEngaged) 
				itsThermometer.setTemperature(itsThermometer.getTemperature() + 1);
			else
				itsThermometer.setTemperature(itsThermometer.getTemperature() - 1);
			System.out.println("Temp = " + itsThermometer.getTemperature());
		}
	}
	
	public synchronized void sleep(long msec)
	{
		try
		{
			wait(msec);
		}catch(InterruptedException e){}
	}
}
