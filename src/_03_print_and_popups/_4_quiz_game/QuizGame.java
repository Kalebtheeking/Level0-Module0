package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		JOptionPane.showMessageDialog(null,"Welcome to Caleb's charismatic quiz! ");
		String story = 
				"Instructions\n"
				+ "If you get an answer right then you will get a point\n"
				+ "There are 9 questions\n"
				+ "the harder the question, the more points you will get\n"
				+ "The easier the question, the more points you will lose"
				+ "It is possible to get negative points\n"
				+ "cAPiTalS dOn'T MaTter\n"
				+ "Questions will gradually get harder\n"	
				+ "best score is 45\n"
				+ "Good Luck!";
		
		JOptionPane.showMessageDialog(null, story);
		int score = 0;
		
		String question1 = JOptionPane.showInputDialog("What is the chemical symbol for water");
				
		if (question1.equalsIgnoreCase("h2O")) {
			score +=1;
			JOptionPane.showMessageDialog(null,"CORRECT! +1 point");
		}
		else {
			score-=10;
			JOptionPane.showMessageDialog(null," Drink more water\n"
					+ "The correct answer was H2O -10 points");
		}
		
		//111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
		//new
		
		String question2 = JOptionPane.showInputDialog("How many rings are on the olympic flag");
		
		if (question2.equalsIgnoreCase("5") || question2.equalsIgnoreCase("five")) {
			score +=2;
			JOptionPane.showMessageDialog(null," Nice job,+2 points!!");
		}
		else {
			score-=9;
			JOptionPane.showMessageDialog(null," womp womp\n"
					+ " The correct answer was five -9 points");
		}
		
		//111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
		//new
		
		String question3 = JOptionPane.showInputDialog("Who painted the ceiling on the Sistine Chapel (first name only)");
		
		if (question3.equalsIgnoreCase("michealangelo")) {
			score +=3;
			JOptionPane.showMessageDialog(null," babababaBINGOOOOOO +3 points");
		}
		else {
			score-=8;
			JOptionPane.showMessageDialog(null,"Just get better at history\n"
					+ " The correct answer was Michealangelo -8");
		}
		
		//111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
		
		//new
		
        String question4 = JOptionPane.showInputDialog("Who is the enemy of harry potter? (not voldemort)");
		
		if (question4.equalsIgnoreCase("draco malfoy")) {
			score +=4;
			JOptionPane.showMessageDialog(null," wow, just wow. +4 points");
		}
		else {
			score-=7;
			JOptionPane.showMessageDialog(null, "NOOOOOPPPPEE \n"
					+ " The correct answer was Draco malfoy -7");
		}
		
		//111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
		//new
		
        String question5 = JOptionPane.showInputDialog("how many points is one american football touchdown and an \n"
        		+ "extra point kick? (just the number)");
		
		if (question5.equalsIgnoreCase("7") || question5.equalsIgnoreCase("seven")){
			score +=5;
			JOptionPane.showMessageDialog(null," MERICAAAAA  RAHHHH +5 points");
		}
		else {
			score-=6;
			JOptionPane.showMessageDialog(null," uhhhhh \n"
					+ "The correct answer was seven -6 points");
		}
		
		//111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
		
		String question6 = JOptionPane.showInputDialog("Who painted the ceiling on the Sistine Chapel (first name only)");
		
		if (question6.equalsIgnoreCase("michealangelo")) {
			score +=6;
			JOptionPane.showMessageDialog(null," babababaBINGOOOOOO +6 points");
		}
		else {
			score-=5;
			JOptionPane.showMessageDialog(null,"Just get better at history\n"
					+ " The correct answer was Michealangelo -5 points");
		}
		
		
		//111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
		
		
		String question7 = JOptionPane.showInputDialog("What do you call an animal that can live on both land and water?");
		
		if (question7.equalsIgnoreCase("anphibious") || question7.equalsIgnoreCase ("Anphibian")) {
			score +=7;
			JOptionPane.showMessageDialog(null," your a pretty cool guy +7 points");
		}
		else {
			score-=4;
			JOptionPane.showMessageDialog(null," go get em next time anphibian -4 points");
		}
		
		//111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
		
		String question8 = JOptionPane.showInputDialog("what is the 6th planet away from the sun");
		
		if (question8.equalsIgnoreCase("Saturn")) {
			score +=8;
			JOptionPane.showMessageDialog(null," future Astronomer over here!\n"
					+ "(your right) + 8 points");
		}
		else {
			score-=3;
			JOptionPane.showMessageDialog(null," this isn't rocket science,\n"
					+ "The correct answer was Saturn -3 points");
		}
		
		//111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
		
		
		String question9 = JOptionPane.showInputDialog("which movie won academy award for best picture in 1994?");
		
		if (question9.equalsIgnoreCase("Forest Gump")) {
			score +=9;
			JOptionPane.showMessageDialog(null,"Run, Forest, Run! +9 points");
		}
		else {
			score-=2;
			JOptionPane.showMessageDialog(null,"ohh.. I was really rooting for \n"
					+ "you to get it right, it was Forest Gump -2 points");
		}
		
		//111111111111111111111111111111111111111111111111111111111111111111111111111111111111111
		
		JOptionPane.showMessageDialog(null, "your final score was " + score);
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
