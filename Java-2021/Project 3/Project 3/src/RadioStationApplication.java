import java.util.Scanner;
public class RadioStationApplication {
	
	public static void main (String[] args) {
		String radioCsign; 
		Double frequency;
			Scanner sc = new Scanner(System.in);
			RadioStation r[] = new RadioStation [6];
		for(int i = 0; i<6; i++){
			System.out.print("\nEnter Call Signal: ");
			radioCsign = sc.next();
				sc.nextLine();
			System.out.print("\nEnter Frequency: ");
			frequency = sc.nextDouble();
			
			try {
				RadioStation rss = new RadioStation (radioCsign,frequency);
				
				
			
			}
			
			catch (RadioStationException e){
				System.out.println(e.getMessage());
			}
			
			
			
	}
		
		
		
		
		
		
	}


}