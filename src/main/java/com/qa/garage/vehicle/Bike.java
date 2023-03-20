package com.qa.garage.vehicle;

public class Bike extends Vehicle {

	public Bike(int numWheels, String colour) {
		super(numWheels, colour);
	}

	@Override
	public int calcBill() {
		return 31;
	}

	@Override
	public String toString() {
		return "Bike [calcBill()=" + calcBill() + ", getId()=" + getId() + ", getNumWheels()=" + getNumWheels()
				+ ", getColour()=" + getColour() + "]";
	}

}