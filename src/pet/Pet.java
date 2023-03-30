package pet;
import java.util.Scanner;

import cat.Cat;
import dog.Dog;
import main.Main;

public class Pet {
	private String petType;
	private String petName;
	private int petAge;
	private int daysStay;
	private double amountDue;
	private int petSpace;
	
	public Pet() {}
	
	public Pet(String name, String petType, int petAge, int daysStay) {
		setPetName(name);
		setAmountDue(0.0);
		setPetType(petType);
		setPetAge(petAge);
		setDaysStay(daysStay);
	}
	
	public int getPetSpace() {
		return petSpace;
	}
	public void setPetSpace(int space) {
		this.petSpace = space;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public int getPetAge() {
		return petAge;
	}
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	public int getDaysStay() {
		return daysStay;
	}
	public void setDaysStay(int daysStay) {
		this.daysStay = daysStay;
	}
	public double getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
}

	

