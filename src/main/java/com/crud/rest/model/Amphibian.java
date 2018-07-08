package com.crud.rest.model;

public class Amphibian extends AbstractVehicle {
/**
 * Calculates the Amphibian Price based on Model
 * 
 */
	@Override
	public double calculatePrice(String model) {

		double price;
		switch (model) {

		case "Panther":
			price = 12000;
			break;

		case "Jet Ski":
			price = 11000;
			break;

		case "Sherp ATV":
			price = 13000;
			break;

		case "Aquada":
			price = 10500;
			break;

		default:
			price = 0.0;
		}

		return price;
	}
/**
 * Calculates the Amphibian Speed based on Model
 * 
 */
	@Override
	public int calculateSpeed(String model) {
		int speed;
		
		switch (model) {
	case "Panther":
		speed = 70;
		break;

	case "Jet Ski":
		speed = 80;
		break;

	case "Sherp ATV":
		speed = 75;
		break;

	case "Aquada":
		speed = 68;
		break;

	default:
		speed = 0;
	}
		return speed;
	}
	
}
