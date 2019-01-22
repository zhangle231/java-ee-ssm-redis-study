package org.java.design.cmd.impl;

import org.java.design.cmd.Command;
import org.java.design.cmd.Target;

public class SubCommand extends Command {
	
	private Target target;

	@Override
	public void execute(Target target) {
		this.target = target;
		System.out.println(target.toString());
	}

	@Override
	public void undo() {
		System.out.println("undo:" + target.toString());
	}

	@Override
	public void redo() {
		System.out.println("redo:" + target.toString());
	}

}
