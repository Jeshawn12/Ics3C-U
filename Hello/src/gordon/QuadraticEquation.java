/**
 * 
 */
package gordon;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * @author 324003813
 *
 */
public class QuadraticEquation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.0");
		
		int a;
		int b;
		int c;
	
		System.out.println("Enter 3 numbers that will substitued for A, B, and C into the quadratic formula \n");
		System.out.println("Enter the number that will be subsistuting for the variable A below");
		a = Scan.nextInt();
		System.out.println("\n");
		System.out.println("Enter the number that will be subsistuting for the variable B below");
		b = Scan.nextInt();
		System.out.println("\n");
		System.out.println("Enter the number that will be subsistuting for the variable C below");
		c = Scan.nextInt();
		System.out.println("\n");
		System.out.print("X= "); System.out.println(df.format((-1*b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a)));
		
		System.out.print("X= "); System.out.println(df.format((-1*b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a)));
		

	}

}
