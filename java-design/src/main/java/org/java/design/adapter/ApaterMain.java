package org.java.design.adapter;

public class ApaterMain {

	public static void main(String[] args) {
		FishBoat fishBoat = new FishBoat();
		Captain captain = new Captain(new FishBoatApater(fishBoat));
		captain.move();
	}
}
