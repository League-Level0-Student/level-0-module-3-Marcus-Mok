
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "December 9th";
		String dadsBirthday = "October 26th";
		String myBirthday = "October 8 th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birthday = JOptionPane.showInputDialog(null, "what birthday do you want?");
		if(birthday.equalsIgnoreCase("moms")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		else if(birthday.equalsIgnoreCase("dads")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		else if(birthday.equalsIgnoreCase("mine")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		
		
		
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
