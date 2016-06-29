package day1.robot;

//Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		
		
		String crush = JOptionPane.showInputDialog("Who do you hate?");
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + crush);
		String friend = JOptionPane.showInputDialog("Who is youu best friend?");
		JOptionPane.showMessageDialog(null, friend + " is sweet as candy.");		

	} 
}

