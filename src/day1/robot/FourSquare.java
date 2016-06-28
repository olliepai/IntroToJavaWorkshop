package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot Bob = new Robot();
	

	void go() {
		Bob.setSpeed(10);
		Bob.penDown();                                                                               
		Bob.setPenWidth(5);

		for (int i = 0; i < 4; i++) {
			Bob.setRandomPenColor();
			Bob.turn(90);
			drawSquare();
			
		}


	}

	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		
		for (int i = 0; i < 4; i++) {
			Bob.move(400);
			Bob.turn(90);
			
		}

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
