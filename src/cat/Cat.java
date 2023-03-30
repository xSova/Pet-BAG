package cat;

import pet.Pet;

public class Cat extends Pet {
	public Cat(String name, int catSpace) {
		setCatSpaceNumber(catSpace);
		
		
		// TODO Auto-generated constructor stub
	}

	private int catSpaceNumber;

	public int getCatSpaceNumber() {
		return catSpaceNumber;
	}

	public void setCatSpaceNumber(int catSpaceNumber) {
		this.catSpaceNumber = catSpaceNumber;
	}
}
