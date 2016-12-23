/**
 * 
 */
package gordon;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 324003813
 *
 */
public class Exercise10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
				
		int burgers;
		int soda;
		int fries;
		double total;
		double tax;
		double amount;
		
		System.out.print("Enter the number of burgers");
		burgers = Scan.nextInt();
		
		System.out.print("Enter the number of soda");
		soda = Scan.nextInt();
		
		System.out.print("Enter the number of fries");
		fries = Scan.nextInt();
		
		total = 1.69*burgers + 1.09*fries + 0.99*soda;
		System.out.print("Total before tax: " + total);
		

		

	}

}
