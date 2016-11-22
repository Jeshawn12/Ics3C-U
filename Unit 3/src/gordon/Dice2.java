/**
 * 
 */
package gordon;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 324003813
 *Jeshawn Gordon
 *11/22/16
 * rolling two dice twice, first for the user, and then for the computer. Then announce who won: the user, the computer, or say it was a tie.
 */
public class Dice2 {

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
		int counter=2;
		String anwser;
	
		
	
		
		do{
			
			
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		
		
		player = die1+die2;
		
		System.out.println("User: " + player );
		
		die1 = (int)(Math.random()*6)+1;
		die2 = (int)(Math.random()*6)+1;
		
		computer = die1+die2;
		
		System.out.println("Computer: " + computer);
		
		if (player > computer)
			System.out.println("You Win");
		else if(computer > player)
			System.out.println("You Lose");
			
		else
			System.out.println("Its a Tie");
		
		System.out.println("Would the user like to play again");
		anwser = Scan.nextLine();
		
		}while(anwser.equals("yes"));


	}

}
