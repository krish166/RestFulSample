package com.crud.rest.model;

public class Airplane extends AbstractVehicle {
/**
 * calculates the Price of the Airplane based on Model
 */
	@Override
	public double calculatePrice(String model) {

		double price;
		switch (model) {

		case "Emirates":
			price = 1000;
			break;

		case "Delta":
			price = 900;
			break;

		case "British Airways":
			price = 1200;
			break;

		case "United Airlines":
			price = 950;
			break;

		default:
			price = 0.0;
		}

		return price;
	}
	/**
	 * Calculates the speed of the airplane based on model
	 */

	@Override
	public int calculateSpeed(String model) {
		int speed;
		switch (model) {

		case "Emirates":
			speed = 820;
			break;

		case "Delta":
			speed = 800;
			break;

		case "British Airways":
			speed = 780;
			break;

		case "United Airlines":
			speed = 800;
			break;
		default:
			speed = 0;
		}
		return speed;
	}

}
