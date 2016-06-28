import org.jointheleague.graphical.robot.Robot;

public class RobotTest 
{	
	public static void main(String[] args) 
	{	
		Robot Bob = new Robot();
		for (int i = 0; i < 4; i++) 	
		{
			Bob.setPenWidth(900);
			Bob.penDown();
			Bob.setRandomPenColor();
			Bob.setSpeed(90);
			Bob.move(400);
			Bob.turn(90);
		}
	}
}
