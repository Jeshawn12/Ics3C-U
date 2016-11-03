/**
 * 
 */
package gordon;
import java.text.DecimalFormat;
import java.util.Scanner;
/**PrintingApp
 * @author 324003813
 *Jeshawn Gordon
 *11/2/16
 *Printing prices application
 */
public class PrintingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		int copies;
		double price = 0;
		double total;
		
		System.out.print("Enter the number of copies to be printed: ");
		copies = Scan.nextInt();

		
		//assign price based on number of copies
	
		if (copies <= 99)
			price = 0.30;		
		else if (copies <= 499)
		    price = 0.28;
		else if (copies <= 749)
			price = 0.27;
		else if (copies <= 1000)
			price = 0.26;
		else
			price = 0.25;
		
		
		System.out.println("Price per copy is: " + price);
		
		 total = copies*price;
		System.out.println("Total cost is: " + (df.format(total)));
		
	
		
		
		
		

	}

}
