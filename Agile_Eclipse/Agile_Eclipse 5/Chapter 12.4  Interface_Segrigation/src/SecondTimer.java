
public class SecondTimer extends Timer implements Runnable {

	int itsTimeout;
	TimerClient itsTimerClient;
	
	@Override
	public void Register(int timeout, TimerClient clinet) {
		itsTimeout = timeout;
		itsTimerClient = clinet;
	    Thread t = new Thread(this);
	    t.start();
	}
	
	public void run() {
		for(;;) {
		sleep(itsTimeout*1000);
		itsTimerClient.TimeOut();
		}
	}
	
	public synchronized void sleep(long msec)
	{
		try
		{
			wait(msec);
		} catch(InterruptedException e){}
	}
}
