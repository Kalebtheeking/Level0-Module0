package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String Code = JOptionPane.showInputDialog("Do you know how to code??????????");

		// 2. If they say "yes", tell them they will rule the world.
		if (Code.equalsIgnoreCase("yes")) {
			String story =
					"You will rule the world!";
			JOptionPane.showMessageDialog(null, story);
		}

	
		else {
			String story =
			"sign up for league of amazong programers";
			JOptionPane.showMessageDialog(null, story);
		}

	}
}

