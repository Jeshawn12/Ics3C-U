/**
 * 
 */
package gordon;




/**
 * @author 324003813
 *jeshawnGordon
 * 23/11/16
 * Create a Powertable that displays a table of powers
 */
public class Powerstable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.format("%15s %10s %10s %10s %10s ","x^1","x^2","x^3","x^4","x^5\n");
		
		for(int x = 1; x<=6;x++) {
			System.out.format("%15s %10s %10s %10s %10s", Math.pow(x, 1),Math.pow(x, 2),Math.pow(x, 3),Math.pow(x, 4),Math.pow(x, 5)+"\n");
			
			
		}
			
			
		

	}

}
