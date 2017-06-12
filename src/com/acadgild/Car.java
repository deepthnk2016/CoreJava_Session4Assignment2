package com.acadgild;

/**
 * 
 * This is the parent Car class
 * Car class have properties - speed and color
 */

public class Car {

	private int speed;
	private String color;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void carDetatils() {
		System.out.println("Car speed = " + speed + " Color = " + color);
	}

}
