
public class DoorTimerAdapter implements TimerClient {

	TimedDoor itsTimedDoor;
	
	DoorTimerAdapter(TimedDoor timedDoor) {
		itsTimedDoor = timedDoor;
	}
	
	public void TimeOut() {
		itsTimedDoor.DoorTimeOut();
	}

}
