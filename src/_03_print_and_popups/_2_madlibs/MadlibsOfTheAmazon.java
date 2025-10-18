package _03_print_and_popups._2_madlibs;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		String prompt =  "A normal day";
		JOptionPane.showMessageDialog(null, prompt);
		// Get the player to enter an adjective
		String adjective1 = JOptionPane.showInputDialog("please enter an adjective (preferably not a color) ");
		
		String drink = JOptionPane.showInputDialog("please enter a drink");
		
		// Get the player to enter a type of liquid
		String food = JOptionPane.showInputDialog("Please enter a food");

		// Get the player to enter a body part
		String place = JOptionPane.showInputDialog("Please enter a place");

		// Get the player to enter a verb
		String vehicle = JOptionPane.showInputDialog("please enter a vehicle");

		// Get the player to enter a place
		String activity = JOptionPane.showInputDialog("please enter an activity");
		
		String medication = JOptionPane.showInputDialog("please enter a medication");
		String adjective2 = JOptionPane.showInputDialog("please enter an adjective");
		String activity2 = JOptionPane.showInputDialog("please enter a activity");
		// The story below has has been written as a group of Strings joined together by + signs.
		// The story contains place holders, indicated by [** **] which you need to replace with
		// the values entered b the player.
		// Hint:  You will need to add more + signs to join the variables to the other parts of the story.
		
		String story = 
		
				"MY "+adjective1+" DAY\n"
						+ "Today I woke up and drank my some "+drink+" to wake me up.\n "
						+ "I had some "+food+" for breakfast and got on my way to "+place+" in my "+vehicle+" \n "
						+ "My favorite thing to do in the "+vehicle+" is to "+activity+"\n "
						+ "after I go to "+place+", I always make sure to stop by the pharmacy to get my daily dosage of "+medication+"\n"
						+ "At this point in the day I am pretty "+adjective2+", So I should start preparing for my "+activity2+" tomorro go to bed";
		
										
					
		// Make a pop-up that contains the final story. The \n escape characters add line breaks to the story. 
		// If you need to, move them around to make your story look better in the pop-up
		JOptionPane.showMessageDialog(null, story);
		// If you want to write your own Madlib story, just change the story variable and ask the player different questions.

	}
}