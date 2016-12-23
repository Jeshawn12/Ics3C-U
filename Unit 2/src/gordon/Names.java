/**
 * 
 */
package gordon;
import java.text.DecimalFormat;
import java.util.Scanner;

/**Names
 * @author 324003813
 *Jeshawn Gordon
 *11/9/16
 *take a person's name, and then 70% of the time says that the name they typed is their favorite, and 30% of the time says they hate that name.
 */
public class Names {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		String name;
		int num;
		System.out.println("Enter Name Here:" );
		name = Scan.nextLine();
		
		num = (int)(Math.random()*2);
		
		if (num <= 0.70)
		
		System.out.println("This is your favortie name:" + name  );
			
			
		else
		 System.out.println("You do not like this name:" + name );
		 

			

		
		
		
		

	}

}
