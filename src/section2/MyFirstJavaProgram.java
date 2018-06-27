package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
Robot Terminator=new Robot();
Terminator.setPenColor(Color.red);
Terminator.penDown();
for(int i=0; i<4; i++) {
Terminator.move(100);
Terminator.turn(90);
//you can make the robot make an image.....    ._penDown();
//you can make it turn ......     .turn(90);
//you can make the robot have a set speed.....    .setSpeed(100);

		
	}
}
}