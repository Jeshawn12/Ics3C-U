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
public class Dice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
	
		int die1;
		int die2;
		int player;
		int computer;
		
	
		
		
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		
		
		player = die1+die2;
		
		System.out.println("User: " + player );
		
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		
		computer = die1+die2;
		
		System.out.println("Computer: " + computer);
		
		if (player > computer)
			System.out.print("You Win");
		else if(computer > player)
			System.out.print("You Lose");
			
		else
			System.out.print("Its a Tie");
	
	
		

		
		
		

		
		
		
		
	}

}
