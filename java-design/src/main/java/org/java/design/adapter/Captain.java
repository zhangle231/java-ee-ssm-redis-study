package org.java.design.adapter;

public class Captain implements Boat {

	private Boat boat;
	
	public Captain(Boat boat) {
		this.boat = boat;
	}

	@Override
	public void move() {
		boat.move();
	}

}
