
public class RadioStationException extends Exception {
		
	public RadioStationException () {}
	
	public RadioStationException(String radioCsign, double frequency){
		super("Call signal: \"" + radioCsign + "\" with carrier frequency:" + frequency + " is invalid");
	}
	
	public RadioStationException(Throwable cause) {
		super(cause);
	}
}
