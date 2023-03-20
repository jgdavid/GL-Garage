package com.qa.garage.vehicle;

public class Boat extends Vehicle {

	public Boat(int numWheels, String colour) {
		super(numWheels, colour);
	}

	@Override
	public int calcBill() {
		return 15;
	}

	@Override
	public String toString() {
		return "Boat [calcBill()=" + calcBill() + ", getId()=" + getId() + ", getNumWheels()=" + getNumWheels()
				+ ", getColour()=" + getColour() + "]";
	}
}
