package com.qa.garage.vehicle;

public class Car extends Vehicle {

	public Car(int numWheels, String colour) {
		super(numWheels, colour);
	}

	@Override
	public int calcBill() {
		return 10;
	}

	@Override
	public String toString() {
		return "Car [calcBill()=" + calcBill() + ", getId()=" + getId() + ", getNumWheels()=" + getNumWheels()
				+ ", getColour()=" + getColour() + "]";
	}
}
