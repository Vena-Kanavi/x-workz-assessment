package com.xworkz.aquarium.dto;

public class AquariumDTO {

	private int noOfFish;
	private double price;
	private String shape;

	public AquariumDTO() {

	}

	public AquariumDTO(int noOfFish, double price, String shape) {
		super();
		this.noOfFish = noOfFish;
		this.price = price;
		this.shape = shape;
	}

	public int getNoOfFish() {
		return noOfFish;
	}

	public void setNoOfFish(int noOfFish) {
		this.noOfFish = noOfFish;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "AquariumDTO [noOfFish=" + noOfFish + ", price=" + price + ", shape=" + shape + "]";
	}

}
