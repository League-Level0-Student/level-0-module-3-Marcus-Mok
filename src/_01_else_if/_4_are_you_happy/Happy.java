package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
public static void main(String[] args) {
	String happy = JOptionPane.showInputDialog ("are you happy? (yes/no)");
	if (happy .equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "keep doing what you are doing");
	}
	else if (happy .equalsIgnoreCase("no")) {
		String wantToBeHappy = JOptionPane.showInputDialog ("do you want to be happy?");
		
		if (wantToBeHappy .equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "keep doing what you are doing");
		}
		else if (wantToBeHappy .equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "change something");
		}
	}
	else {
		JOptionPane.showMessageDialog(null, "this is a yes/no question");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
