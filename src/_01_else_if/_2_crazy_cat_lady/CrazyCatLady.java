
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

import java.awt.Desktop;

import java.net.URI;

public class CrazyCatLady {
	public static void main(String[] args) {
		String cats = JOptionPane.showInputDialog ("Enter your number of cats");
		 int catsi = Integer.parseInt(cats);
		 if (catsi >= 3) {
			 System.out.println("you are a crazy cat lady");
		 }
		 else if(catsi <= 3) {
		playVideo("https://www.youtube.com/watch?v=2QMeGkbdIVw")	;
		 }
		 else if(catsi == 0) {
			 playVideo("https://www.youtube.com/watch?v=oj_yLBltPE8");
		 }
		
		 // 1. Ask the user how many cats they have
		// 2. Convert their answer into an int
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

