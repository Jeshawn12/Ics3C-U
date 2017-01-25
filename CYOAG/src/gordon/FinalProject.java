/**
 * 
 */
package gordon;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

import hsa_new.Console;


/**
 * @author Jeshawn Gordon
 * A game of baseketball 21
 * 25/01/17
 *
 */
public class FinalProject {
	static Console c = new Console();
	static BufferedImage[] bufferImage;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String answer = "";
		String headstails;
		double num;
		double num2;
		int counter = 0;
		double three;
		double two;
		String Kobe;
		int counter2 = 0;
		int score = 0;
		bufferImage = new BufferedImage[8];
			try {
				bufferImage[0] = ImageIO.read(new File("src/gordon/Final project.psd"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bufferImage[1] = ImageIO.read(new File("src/gordon/kobethree.psd"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bufferImage[2] = ImageIO.read(new File("src/gordon/Player shoot.psd"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bufferImage[3] = ImageIO.read(new File("src/gordon/playerfreethrow.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bufferImage[4] = ImageIO.read(new File("src/gordon/realistic-basketball-court_23-2147492455_edited-1.psd"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bufferImage[5] = ImageIO.read(new File("src/gordon/Three Point Shot.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bufferImage[6] = ImageIO.read(new File("src/gordon/Two pointer kobe.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bufferImage[7] = ImageIO.read(new File("src/gordon/Two pointer(Design)_edited-1.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	


			c.println("Enter User Name here");
			name = c.readLine();
			c.println("Head or Tails??");
			headstails = c.readLine();

			num = (Math.random());
			num2 = (Math.random());

			if(num < .5){
				if(headstails.equals("heads")){
					while(counter  < 21 && counter2 <21){

						counter = counter + userTurn ();
						if(counter > 21){
							counter = 15;
						}
						counter2 = counter2 + computerTurn();

					}

				}else{
					while(counter  < 21 && counter2 <21){
						counter = userTurn();
						counter2 = computerTurn();
					}

				}
			}else
				if(headstails.equals("heads")){
					while(counter  < 21 && counter2 <21){

						counter2 = counter2 + computerTurn ();
						if(counter2 > 21){
							counter2 = 15;
						}
						counter = counter + userTurn();

					}

				}else{
					while(counter  < 21 && counter2 <21){
						counter2 = computerTurn();
						counter = userTurn();
					}
					c.println(counter);
					c.println(counter2);
				}
				}
	public static int userTurn(){
		String yesno;
		double make, miss, two, three;
		int counter = 0;
		String answer = "yes";

		c.println("Are you ready to shoot (Type yes)");
		yesno = c.readLine();
		c.println("You shoot a freethrow");
		c.drawImage(bufferImage[3],250,100, 500, 500, null);
		for(int i = 0; i <  3; i++){
			make = (double)(Math.random()*0.5)+1;
			miss = (double)(Math.random()*0.5)+1;
			if (make > miss){
				counter  ++;
				c.println("You made the shoot");
				c.drawImage(bufferImage[2],250,100, 500, 500, null);
				c.println("Are you ready to shot again! (Type yes) \n");
				answer = c.readLine();

			}else{
				c.println("You miss the shoot are you ready to shot again");
				answer = c.readLine(); 

			}

		}
		three = Math.random();
		two = Math.random();

		if(three<.5){
			c.println("You made a three");
			c.drawImage(bufferImage[5],250,100, 500, 500, null);
			counter = counter+3;
		}else{
			c.println("You made a two");
			c.drawImage(bufferImage[7],250,100, 500, 500, null);
			counter = counter+2;
		}	
		c.println(counter);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		c.clear();
		return counter;

	}


	public static int computerTurn(){
		String yesno;
		double make, miss, two, three;
		int counter2 = 0;
		String answer = "yes";

		c.println("You are on defence \n");
		c.println("Kobe is shooting a freethrow \n");
		c.drawImage(bufferImage[3],250,100, 500, 500, null);
		for(int i = 0; i <  3; i++){
			make = (double)(Math.random()*0.5)+1;
			miss = (double)(Math.random()*0.5)+1;
			if (make > miss){
				counter2  ++;
				c.println("Kobe made the shoot \n");
				c.drawImage(bufferImage[6],250,100, 500, 500, null);
				c.println("Kobe is shooting again!");


			}else{
				c.println("Kobe missed the shoot he shoots again");

			}

		}
		three = Math.random();
		two = Math.random();

		if(three<.5){
			c.println("Kobe with the three");
			c.drawImage(bufferImage[1],250,100, 500, 500, null);
			counter2 = counter2+3;
		}else{
			c.println("Kobe with the fade away two");
			c.drawImage(bufferImage[6],250,100, 500, 500, null);
			counter2 = counter2+2;
		}
		c.println(counter2);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		c.clear();
		return counter2;
	}


}	
