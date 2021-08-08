package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class Age {
public static void main(String[] args) {
	String year = JOptionPane.showInputDialog(null, "enter the year");
	String age = JOptionPane.showInputDialog(null, "enter your year of birth");
	int agei = Integer.parseInt(age);	
	int yeari = Integer.parseInt(year);
	for (;agei <= yeari; agei++ ) {
	 JOptionPane.showMessageDialog(null, agei);
	}
	if(agei >= 2023) {
		JOptionPane.showMessageDialog(null, "you are not alive....................");
	}
	
	
}
}
