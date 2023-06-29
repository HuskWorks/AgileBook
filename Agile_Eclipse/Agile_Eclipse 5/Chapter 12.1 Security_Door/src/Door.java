
public abstract class Door implements TimerClient {
	public abstract void Lock();
	public abstract void Unlock();
	public abstract boolean IsDoorOpen();
}
