
public class Lamp implements ButtonServer {
	String switch_status = "off";
	
	public void turnOn() {
		switch_status = "on";
	}
	
	public void turnOff() {
		switch_status = "off";
	}
	
	public String getStatus() {
		return switch_status;
	}
	
}
