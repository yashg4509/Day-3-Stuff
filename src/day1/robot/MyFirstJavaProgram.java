package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		Robot R2D2 = new Robot();
		R2D2.sparkle(); //Sparkles while moving
		R2D2.penDown(); //Draws line
		
		for(int i = 0; i<10; i++) {  //Runs code multiple times (i.e 10 times) 
		R2D2.move(300); //Moves the robot
		R2D2.turn(270);//Turns the bot
		R2D2.setPenColor(Color.red);
		}
		
		
		
		

	
		
		
	}
}
