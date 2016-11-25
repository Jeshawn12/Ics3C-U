/**
 * 
 */
package gordon;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 324003813
 *jeshawnGordon
 * 25/11/16
 * an elapsedtimecalculator that shows the time entered 
 */
public class elapsedtimecalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		int time;
		int hour;
		String pmam;
		int elasped=12;
	
		
		
		
		System.out.println("Enter the starting hour: ");
		hour = Scan.nextInt();
		Scan.nextLine();
		
		System.out.println("Enter am or pm: ");
	 	pmam = Scan.nextLine();
		System.out.println("Enter the number of elaspsed hours: ");
		time = Scan.nextInt();
		if(pmam.equals("am")){
			if (hour + time<12){
			
				System.out.println("The time is:  " + (time + hour)+"am");
			}
			
			else if (hour + time >12){
			
				System.out.println("The time is:  "+ (time + hour - 12)+"pm");
			}
		}
		
		else if(pmam.equals("pm")){
			if (hour + time <12){
				
				System.out.println("The time is:  "+ (time + hour)+"pm");
			}
			
			else if(hour + time >12){
				
				System.out.println("The time is:  "+(time + hour - 12)+"am");
			}
		
	}

}
}
	
	