
public class Button {
	private Lamp itsLamp;
	public void poll() {
		if (PowerModule.isOn) {
			itsLamp.turnOn();
		}
	}
	
	Button(Lamp lamp) {
		itsLamp = lamp;
	}
}
