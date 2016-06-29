package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		String yes = JOptionPane.showInputDialog("Do you know how to write code?");
		String yess = "yes";
		
		if(yes.equals(yess))
		{
			JOptionPane.showMessageDialog(null, "You will rule the world!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Good luck washing dishes.");
		}


	}
}

