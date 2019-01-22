package org.java.design.cmd;

public abstract class Target {

	private String name;

	@Override
	public abstract String toString();

	public void printStatus() {
		System.out.println(name);
	}
}
