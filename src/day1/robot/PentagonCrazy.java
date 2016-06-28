package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		Robot Bob = new Robot();

		for (int i = 0; i < 500000; i++) 
		{
			Bob.move(300);
			
			if(i < 250000)
			{
				Bob.penDown();
				Bob.setPenColor(Color.CYAN);
				int angle = 50;
				Bob.turn(angle);
				Bob.setSpeed(10);
			}
			
			else
			{
				Bob.setSpeed(5);
			}
			
			}

	}

	/* Variations:
	 *12. make the pattern really huge
	 *13. randomize the color of the pattern 
	 *14. experiment with different shapes*/

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}