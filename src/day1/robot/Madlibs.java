package day1.robot;

import javax.swing.JOptionPane;

public class Madlibs {
	public static void main(String[] args) {
		/*String verb = JOptionPane.showInputDialog("Enter a verb (past tense):");
		String noun = JOptionPane.showInputDialog("Enter a noun:");
		String two = JOptionPane.showInputDialog("Enter another noun:");
		String adjective = JOptionPane.showInputDialog("Enter an adjective:");
		JOptionPane.showMessageDialog(null, "The dead, ugly, and " + adjective + " tortoise " + verb + " the " + noun + " with his " + two );*/
		String name = JOptionPane.showInputDialog("Enter your name");
		String name1 = "Ollie";
		if (name.equals(name1)){
			JOptionPane.showMessageDialog(null, "Great name");
		}
		else {
			JOptionPane.showMessageDialog(null, "That is very ugly");
		}
	}

}
