package dog;

import pet.Pet;

public class Dog extends Pet {
	private int dogSpaceNumber;
	private double dogWeight;
	private boolean grooming;
	
	// getters and setters
	public int getDogSpaceNumber() {
		return dogSpaceNumber;
	}
	public void setDogSpaceNumber(int dogSpaceNumber) {
		this.dogSpaceNumber = dogSpaceNumber;
	}
	public double getDogWeight() {
		return dogWeight;
	}
	public void setDogWeight(double dogWeight) {
		this.dogWeight = dogWeight;
	}
	public boolean getGrooming() {
		return grooming;
	}
	public void setGrooming(boolean grooming) {
		this.grooming = grooming;
	}
	//default Dog object constructor
	public Dog() {
		dogSpaceNumber = 0;
		dogWeight = 0.0;
		grooming = false;
	}
	
	public Dog(int spaceNumber, double weight, boolean groom) {
		setDogSpaceNumber(spaceNumber);
		setDogWeight(weight);
		
	}
}
