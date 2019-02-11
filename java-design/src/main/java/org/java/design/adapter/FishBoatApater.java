package org.java.design.adapter;

public class FishBoatApater implements Boat {

	private FishBoat fishBoat;

	public FishBoatApater(FishBoat fishBoat) {
		this.fishBoat = fishBoat;
	}

	@Override
	public void move() {
		System.out.println("adapter is fire.");
		fishBoat.sail();
	}
}
