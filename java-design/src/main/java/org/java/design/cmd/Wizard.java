package org.java.design.cmd;

import java.util.Deque;
import java.util.LinkedList;

public class Wizard {

	private Deque<Command> undoStack = new LinkedList<>();
	private Deque<Command> redoStack = new LinkedList<>();

	public void executeCmd(Command cmd, Target target) {
		cmd.execute(target);
		undoStack.offerLast(cmd);
	}
	
	public void executeUndo() {
		if (!undoStack.isEmpty()) {
			Command command = undoStack.pollLast();
			command.undo();
			redoStack.offerLast(command);
		}
	}
	
	public void executeRedo() {
		if (!redoStack.isEmpty()) {
			Command command = redoStack.pollLast();
			command.redo();
			undoStack.offerLast(command);
		}
	}

}
