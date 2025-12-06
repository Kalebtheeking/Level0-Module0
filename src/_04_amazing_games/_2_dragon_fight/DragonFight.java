package _04_amazing_games._2_dragon_fight;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {

	public static void main(String[] args) {

		Random ran = new Random();    //This will be used later to make random numbers. 

		ImageIcon sweat = new ImageIcon("/Level0-Module0/src/_04_amazing_games/_2_dragon_fight/sweatysoccerskin.png");
		JOptionPane.showMessageDialog(null, "Help save the Fortnite island and defeats"," ",0, sweat);

		// 1. Create some variables to hold health levels
		int playerhealth;
		int sweathealth;
			// playerHealth to store your health - set it equal to 100
	playerhealth = 100;
			// dragonHealth to store the dragon's health - set it equal to 100
	sweathealth = 100;
		// 2. Create some variables to hold the attack strengths. These will be given different values later. 
		int playerattack;
		int sweatattack;
			// playerAttack to store the damage the player's attack will do - set it equal
			// to 0 for now.
	playerattack = 0;
	sweatattack = 0;
			// dragonAttack to store the damage the dragon's attack will do - set it equal
			// to 0 for now.

		
		//  This while statement will cause the game attack code to repeat
		while (true) {

			// THE PLAYER ATTACKS THE DRAGON
			String attack1 = JOptionPane.showInputDialog("do you want to attack the sweat with \n"
					+ "a shotgun or a rifle");
			
			if (attack1.equalsIgnoreCase("yell")) {
				sweathealth-=ran.nextInt(10);
			}
			if (attack1.equalsIgnoreCase("kick")) {
				sweathealth-=ran.nextInt(10)+10;
			}

				// 3. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
	
				// 4. If they typed in "yell":
	
					  // -- Find a random number between 0 and 10 and store it in playerAttack. Use
					  // ran.nextInt(10)
			
				// 5. If they typed in "kick":
	
					  // -- Find a random number between 0 and 25 and store it in playerAttack.
		
				// 6. Subtract the player attack value from the dragon's health

			// THE DRAGON RETALIATES

				// 7. Find a random number between 0 and 35 and store it in dragonAttack
			sweatattack = ran.nextInt(34)+100;
			playerhealth -= sweatattack;
	
				// 8. Subtract the dragon attack value from the player's health

			// ASSESS THE DAMAGE

				// 9. If the player's health is less than or equal to 0, the game is over,
				//    call the playerLost() method
			if (playerhealth <=0) {
				
				String youlost = 
						"skill issue, you died";
				JOptionPane.showMessageDialog(null, youlost);
				playerLost();
			}
	
			
				// 10. If the dragon's health is less than or equal to 0, the game is over,
				//     call the dragonLost() method
			if (sweathealth <=0) {
				String youwon = 
						"number 1 victory royal , you won";
				JOptionPane.showMessageDialog(null, youwon);
				dragonLost();
			}
			
				// 11.  Pop up a message that tells us how much health the player and
				// 		dragon have left.
			String damageassesment = 
					
					"You have "+playerhealth+" health \n"
							+ "and the dragon has "+sweathealth;
			JOptionPane.showMessageDialog(null, damageassesment);
					
							
					
				
					
			
			// (Bonus: Also display the amount of health that was lost by each in this
			// round)
			

		} // this is the end of the while loop

	}

	static void playerLost() {
		// 11. Tell the player that they have been defeated by the dragon and have no treasure


		System.exit(0);   //This code ends the program
	}

	static void dragonLost() {
		// 12. Tell the user that the dragon has been defeated and they get a ton of gold!

		System.exit(0);   //This code ends the program
	}

}
