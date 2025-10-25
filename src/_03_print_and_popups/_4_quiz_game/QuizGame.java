package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		String story = 
				"Welcome to the quiz game.\n"
				+ "If you get an answer right then you will get a point\n"
				+ "If you get an answer wrong you will minus a point\n "
				+ "It is possible to get negative points\n"
				+ "cAPiTalS dOn'T MaTter\n"
				+ "Questions will gradually get harder\n"
				+ "best score is 7\n"
				+ "Good Luck!";
		
		JOptionPane.showMessageDialog(null, story);
		int score = 0;
		
		String question1 = JOptionPane.showInputDialog("What is the chemical symbol for water");
				
		if (question1.equalsIgnoreCase("h20")) {
			score +=1;
		}
		else {
			score-=1;
		}
		
		//new
		
		String question2 = JOptionPane.showInputDialog("How many rings are on the olympic flag");
		
		if (question2.equalsIgnoreCase("5")) {
			score +=1;
		}
		else {
			score-=1;
		}
		//new
		
		String question3 = JOptionPane.showInputDialog("Who painted the ceiling on the Sistine Chapel (first name only)");
		
		if (question3.equalsIgnoreCase("michealangelo")) {
			score +=1;
		}
		else {
			score-=1;
		}
		//new
		
		String question4 = JOptionPane.showInputDialog("what is the 7th planet away from the sun");
		
		if (question4.equalsIgnoreCase("uranus")) {
			score +=1;
		}
		else {
			score-=1;
		}
		//new
		
        String question5 = JOptionPane.showInputDialog("Who who is the enemy of harry potter? (not voldemort)");
		
		if (question5.equalsIgnoreCase("draco malfoy")) {
			score +=1;
		}
		else {
			score-=1;
		}
		
		//new
		
        String question6 = JOptionPane.showInputDialog("how many points is one american football touchdown and a feild goal? (just the number)");
		
		if (question6.equalsIgnoreCase("9")) {
			score +=1;
		}
		else {
			score-=1;
		}
		
		//new
		
		String question7 = JOptionPane.showInputDialog("What do you call an animal that can live on both land and water?");
		
		if (question7.equalsIgnoreCase("anphibian")) {
			score +=1;
		}
		else {
			score-=1;
		}
		
		
		
		JOptionPane.showMessageDialog(null, "your final score was " + score);
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
