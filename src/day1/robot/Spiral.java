package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot Bob = new Robot();
		
		Bob.penDown();

		Bob.setSpeed(100);

		for (int i = 0; i < 400; i++)
		{

			Bob.setRandomPenColor();
	
			Bob.move(2*i);
	
			Bob.turn(360/7);
			
			Bob.turn(360/6);
			
			Bob.turn(360/5);
			
			Bob.turn(360/4);
			
			Bob.turn(360/3);
			
			
	
			Bob.setPenWidth(i);
		}

	}
}
