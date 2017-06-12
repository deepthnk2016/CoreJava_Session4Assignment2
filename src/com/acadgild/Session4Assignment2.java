package com.acadgild;

/**
 * 
 * Main Class
 *
 */
public class Session4Assignment2 {
	public static void main(String args[]) {

		// Intantiate Swift class object and set the speed and color
		Swift swift = new Swift();
		swift.setColor("white");
		swift.setSpeed(80);

		// Display car details
		swift.carDetatils();

		// Display engine details
		swift.engineDetails("S12345", 800);
	}

}
