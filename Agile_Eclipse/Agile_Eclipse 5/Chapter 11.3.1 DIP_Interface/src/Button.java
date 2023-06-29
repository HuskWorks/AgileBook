
public class Button {
	private ButtonServer itsLamp;
	public void poll() {
		if (PowerModule.isOn) {
			itsLamp.turnOn();
		}
	}
	
	Button(ButtonServer lamp) {
		itsLamp = lamp;
	}
}
