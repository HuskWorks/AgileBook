
public class TimedDoor extends Door {

	boolean isDoorOpen;
	
	TimedDoor(boolean _isDoorOpen) {
		isDoorOpen = _isDoorOpen;
	}
	
	@Override
	public boolean IsDoorOpen() {
		return isDoorOpen;
	}

	@Override
	public void Lock() {
		// TODO Lock the Door
		isDoorOpen = false;
	}

	@Override
	public void Unlock() {
		// TODO Unlock the Door
		isDoorOpen = true;
	}

	public void DoorTimeOut() {
		System.out.println("=== Timeout! ===");
	}

	public TimerClient getDoorTimerAdapter() {
		return new DoorTimerAdapter(this);
	}

}
