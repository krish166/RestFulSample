package com.crud.rest.model;

public class Drone extends AbstractVehicle {
/**
 * Calculates the Drone Price based on Model
 * 
 */
	@Override
	public double calculatePrice(String model) {

		double price;
		switch (model) {

		case "Phantom":
			price = 12000;
			break;

		case "Inspire":
			price = 11000;
			break;

		case "Mavic":
			price = 13000;
			break;

		case "Typhoon":
			price = 10500;
			break;

		default:
			price = 0.0;
		}

		return price;
	}
/**
 * Calculates the Drone Speed based on Model
 * 
 */
	@Override
	public int calculateSpeed(String model) {
		int speed;
		
		switch (model) {
	case "Phantom":
		speed = 70;
		break;

	case "Inspire":
		speed = 80;
		break;

	case "Mavic":
		speed = 75;
		break;

	case "Typhoon":
		speed = 68;
		break;

	default:
		speed = 0;
	}
		return speed;
	}
	
}
