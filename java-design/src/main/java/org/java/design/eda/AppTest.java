package org.java.design.eda;

import org.java.design.eda.event.UserCreateEvent;
import org.java.design.eda.fw.EventDispatcher;
import org.java.design.eda.handler.UserCreateHandler;
import org.java.design.eda.model.User;

public class AppTest {
	public static void main(String[] args) {
		EventDispatcher eventDispatcher = new EventDispatcher();

		eventDispatcher.registerHandler(UserCreateEvent.class,
				new UserCreateHandler());

		User user = new User();
		user.setName("test");
		
		eventDispatcher.dispatch(new UserCreateEvent(user));
	}
}
