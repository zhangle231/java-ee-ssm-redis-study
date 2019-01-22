package org.java.design.cmd;

public abstract class Command {

	public abstract void execute(Target target);

	public abstract void undo();

	public abstract void redo();

}
