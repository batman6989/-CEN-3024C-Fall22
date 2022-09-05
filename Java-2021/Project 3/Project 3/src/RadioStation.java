import java.util.Scanner;
import java.util.regex.*;
public class RadioStation {
	String callingsign;
	Double frequen;
	
	RadioStation(String radioCsign, double frequency) throws RadioStationException{
		 
		if (radioCsign.length() != 4 || (!radioCsign.matches("[A-Za-z]{4}")) || frequency < 88.00 && frequency > 108.00)
		{
				throw new RadioStationException(radioCsign, frequency); 
		}
			callingsign = radioCsign;
			frequen = frequency;
			System.out.println("Object Creation successful!\n");
				}
		
	
		
		
		
		
		
		
		
		
		
		
}

