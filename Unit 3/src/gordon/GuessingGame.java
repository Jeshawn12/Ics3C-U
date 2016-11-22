/**
 * 
 */
package gordon;

import java.util.Scanner;

/**
 * Jeshawn Gordon
 *11/22/16
 * @author 324003813
 *Pick a number from 1-20
 */
public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner (System.in);
		
		
		int computer;
		int player;
		
		computer = (int)(Math.random()*20)+1;
		System.out.println("Pick a number from 1 to 20");
		player = Scan.nextInt();
		
		if (computer == player){
			System.out.print("You Win");
		}
		
		else
			System.out.print("Better luck Next Time");
		
		
		
		
		
		
		
		

	}

}
