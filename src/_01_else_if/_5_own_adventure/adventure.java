package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class adventure {
public static void main(String[] args) {
	String leftOrRight = JOptionPane.showInputDialog ("As the path continues, there is a split in the road. Left or Right?");
	if (leftOrRight .equalsIgnoreCase("left")) {
	String fasterOrQuieter = JOptionPane.showInputDialog(null, "As you walk along the left path, you hear animals walking around you in the tall grass. Walk faster, or Walk Quieter");
		
		if (fasterOrQuieter.equalsIgnoreCase("Quieter")) {
			JOptionPane.showMessageDialog(null, "you hear the animals lose intrest and walk away");
			String motorcycleOrCar = JOptionPane.showInputDialog(null, "you come across a car and a motorcycle that say they are free. Which one do you take? motorcycle/Car");
	//CONTINUE HERE FROM THE STORY THEN DO THE RIGHT SIDE OF THE STORY, ALSO DO THE PART AFTER STAND YOUR GROUND
		
		}
			if (fasterOrQuieter.equalsIgnoreCase("Faster")) {
				String bear = JOptionPane.showInputDialog(null, "you encounter a bear hiding in the grass. Do you (Run/Stay");
				
				if (bear.equalsIgnoreCase("Stay")) {
				 JOptionPane.showMessageDialog(null, "You stand your ground and the bear walks away after looking for a bit.");
				//HERE IS THE STAND YOUR GROUND PART FINISH THIS
				
				}
				if (bear.equalsIgnoreCase("Run")) {
					 JOptionPane.showMessageDialog(null, "The bear outruns you and you get killed by the bear.");
					}
			
			}
	
	}




















}
}