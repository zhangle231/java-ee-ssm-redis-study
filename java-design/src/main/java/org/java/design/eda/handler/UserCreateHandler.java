package org.java.design.eda.handler;

import org.java.design.eda.event.UserCreateEvent;
import org.java.design.eda.fw.Handler;

public class UserCreateHandler implements Handler<UserCreateEvent>{

	@Override
	public void onEvent(UserCreateEvent event) {
		System.out.println("user " + event.getUser().getName() + " has been created!.");
	}
}
