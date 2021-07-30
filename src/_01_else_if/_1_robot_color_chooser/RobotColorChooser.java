
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(100);
		
		rob.setPenWidth(10);
		while (0 < 100) {
		String red = JOptionPane.showInputDialog ("enter red");
		String blue = JOptionPane.showInputDialog ("enter blue");
		String green = JOptionPane.showInputDialog ("enter green");
		int redi = 0;
		int bluei = 0;
		int greeni = 0;
		try {
			redi = Integer.parseInt(red);
			bluei = Integer.parseInt(blue);
			greeni = Integer.parseInt(green);
		} catch (Exception e) {
			Random ran = new Random();
			redi= ran.nextInt(255);
			bluei= ran.nextInt(255);
			greeni= ran.nextInt(255);
		}
		rob.setPenColor(redi, bluei, greeni);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(90);
		rob.turn(5);
	}
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
