package org.java.design.eda.event;

import org.java.design.eda.model.User;

public class UserCreateEvent extends AbstractEvent {

	User user;

	public UserCreateEvent(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
