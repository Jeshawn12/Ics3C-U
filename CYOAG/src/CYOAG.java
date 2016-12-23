/**
 * 
 */
import java.io.File;
import java.text.DecimalFormat;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import hsa_new.Console;
/**
 * jeshawn gordon
 * @author 324003813
 *23/12/16
 *CYOAG
 */
public class CYOAG {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c = new Console();
		DecimalFormat df = new DecimalFormat ("0.00");


		String answer = "";
		String yesno;
		double shot;
		double make;
		double miss;
		int counter = 0;
		int total;
		String fight;
		String run;
		String accept;
		try{
		
		Clip music = AudioSystem.getClip();
		music.open(AudioSystem.getAudioInputStream(new File("Lil Bow Wow - Basketball.wav")));

		make = (double)(Math.random()*0.5)+1;
		miss = (double)(Math.random()*0.5)+1;
			do{
			do{
				music.loop(Clip.LOOP_CONTINUOUSLY);
				c.println("You decision to stay another year in school, it's now the off season and you're pilled in homework. You have to make a decision. Do your homework or go to the \ngym. (yes/no) \n");
				yesno = c.readLine();
				if (yesno.equals("yes")){
					c.println("You decide to go to the gym and work on your freethows. \n");
					c.clear();
					do{
						make = (double)(Math.random()*0.5)+1;
						miss = (double)(Math.random()*0.5)+1;
						if (make > miss){
							counter  ++;
							c.println("You made the shoot");


						}else{  
							c.println("Better luck next time you missed the shot");


						}

						c.println("Would you like to shoot again! \n");
						answer = c.readLine(); 
						c.clear();

					}while(answer.equals("yes")); 				
					c.println(counter);

					if (answer.equals("no")){
						c.println("You finish at the gym and decide to go out with some friends. You guys do to a \nlocal bar and have some drinks. \n");
						c.println("A fight breaks out with you're best friend what do you do. (fight/run)\n");
						fight = c.readLine();
						if (fight.equals("fight")){
							c.clear();
							c.println("The fight get out of hand and the poilce are called and you're arrested!\n");
							c.println("Your NBA career ended before it could start would you like to play again?\n");


						}else{
							c.clear();
							c.println("You decide to run and leave you're friends in the brawl the poilce show up and  ask you to stop you continue ruuning and get arrested!\n");
							c.println("Your NBA career ended before it could start would you like to play again?\n");

						}
						c.println("Would you like to play again! \n");
						answer = c.readLine(); 
						c.clear();




					}


				}




			} while(answer.equals("yes")); 

			if(yesno.equals("no")){
				c.clear();
				c.println("You decide to stay home and catch up on your homework. A few hours go by and you decide to take a break and go out with teammates. \n");
				c.println("You guys are talking and someone brings up steroids!\n");

				c.println("Do you accept or decline the steroids?(yes/no)");
				accept = c.readLine();

				if(accept.equals("yes")){
					c.clear();
					c.println("You decide to take the steroids it was the most thrilling momment of your life.");
					c.println("A few days go by and the committee declare a random drug test of all the NCAA \ncollage basketball players. \n");
					c.println("You start to freak out and you don't know what to do. Your teammates reassure \nyou that everthing will be ok. \n");
					c.println("You decide to go ahead and take the drug test hoping that the steroid were \nalready out  your system.");
					Thread.sleep(20000);
					c.clear();
					c.println("Two weeks go by and you were tested positive for steroids!!! \n");
					c.println("You are suspended for the next season (365 days!) and you decide to quit playing basketball and pursue a different career!!\n");
					Thread.sleep(10000);
					c.clear();
					c.println("Your NBA career ended before it could start would you like to play again?\n");
					answer = c.readLine();

				}else if(accept.equals("no")){
					
					c.clear();
					c.println("You decide to decline the offer of steroids and go home to finish your left over homework.");
					c.println("A few days go by and the committee declare a random drug test of all the NCAA   collage basketball players. \n");
					c.println("You start to freak out and you don't know what to do. Your teammates will be\n suspended and you don't want that to happen they reassure \n you that everthing will be ok and that they will be fine. \n");
					Thread.sleep(15000);
					c.clear();
					c.println("Two weeks go by and you were tested negative for drugs !!!\n ");
					c.println("Your teammates were tested positive though");
					Thread.sleep(15000);
					c.clear();
					c.println("During the season your team struggles and comes 13 overall in the league.\n");
					c.println("But your hard work doesn't go unoticed!!!1");
					Thread.sleep(10000);
					c.clear();
					c.println("YOU GET DRAFTED 3 OVERALL IN THE FIRST ROUND!!!!!");
					Thread.sleep(5000);
					c.clear();
					c.println("CONGRATULATIONS YOU HAVE MADE IT TO THE NBA!!!");
					c.println("Would you like to play again! \n");
					answer = c.readLine(); 
					
				}
					


			}
			}while(answer.equals("yes"));
			music.stop();

		}catch(Exception e) {
			System.err.println(e.getMessage());
		}


	

	}


}
