package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String code = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if(code.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "YOU WILL RULE THE WORLD!!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Good luck washing dishes while I rule the world!!");
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

