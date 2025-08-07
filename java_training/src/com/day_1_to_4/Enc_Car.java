package com.day_1_to_4;

public class Enc_Car {
	
	 private boolean engineon;
	 private int speed;
	 private double fuellevel;
	 
	 public void startEngine() 
	 {
		 engineon = true;
	 }

	 public void stopEngine()
	 {
		 engineon = false;
		 speed = 0;
	 }
	 
	 public void setSpeed(int speed) 
	 {
		 if (engineon && speed >= 0)
		 {
			 this.speed = speed;
		 }
	 }
	 
	 public int getSpeed() 
	 {
		 return speed;
	 }
	 
	 public double getFuelLevel()
	 {
		 return fuellevel;
	 }
	 
	 public void refuel(double liters)
	 {
		 if (liters > 0) 
		 {
			 fuellevel += liters;
		 }
	 }
	public static void main(String[] args) {
		

	}

}
