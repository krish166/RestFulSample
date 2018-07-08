package com.crud.rest.model;

public class Boat extends AbstractVehicle {

	/**
	 * Calculates the Boat Price based on Model
	 */
	@Override
	public double calculatePrice(String model) {

		double price;
		switch (model) {

		case "Bass Boat":
			price = 12000;
			break;

		case "Bow Rider":
			price = 11000;
			break;

		case "Pontoon":
			price = 13000;
			break;

		case "Dinghy":
			price = 10500;
			break;

		default:
			price = 0.0;
		}

		return price;
	}
/**
 * Calculates the Boat Speed based on Model
 * 
 */
	@Override
	public int calculateSpeed(String model) {
		int speed;
		switch (model) {

		case "Bass Boat":
			speed = 70;
			break;

		case "Bow Rider":
			speed = 55;
			break;

		case "Pontoon":
			speed = 68;
			break;

		case "Dinghy":
			speed = 65;
			break;

		default:
			speed = 0;
		}
		return speed;
	}
}
