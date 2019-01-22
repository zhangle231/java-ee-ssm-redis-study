package org.java.design.cmd.impl;

import org.java.design.cmd.Wizard;

public class CmdApp {

	public static void main(String[] args) {

		Wizard wizard = new Wizard();

		SubTarget subTarget = new SubTarget();
		
		wizard.executeCmd(new SubCommand(), subTarget);
		
		wizard.executeUndo();
		
		wizard.executeRedo();
	}

}
