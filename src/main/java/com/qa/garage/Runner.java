package com.qa.garage;

import java.util.Scanner;

import com.qa.garage.vehicle.Car;

public class Runner {

	public static void main(String[] args) throws Exception {

		try (Scanner scan = new Scanner(System.in);) {
			Garage g = new Garage();
			g.addVehicle(new Car(4, "Black"));
			System.out.println("Enter ID ");
			System.out.println();
			int id = Integer.parseInt(scan.nextLine());

			System.out.println(g.findById(id));
		}

//			finally {	
//
//			
//		}

//		System.out.println(g);

//		g.removeByType("car");
//		g.remove(Car.class);
//		System.out.println(g);

	}

}
