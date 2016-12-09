/**
 * 
 */
package gordon;

import java.util.Scanner;

/**
 * @author 324003813
 *
 */
public class Chaos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub++
		Scanner Scan = new Scanner (System.in);
		
		double x= Scan.nextDouble();
		double a= Scan.nextDouble();
		for(int c=0; c<50; c++) {
			
			x= (x*(1 - x));
			
			System.out.println(x);
			
			
		}
			
		
		
		
		

	}

}
