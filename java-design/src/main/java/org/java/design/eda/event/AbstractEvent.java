package org.java.design.eda.event;

import org.java.design.eda.fw.Event;

public abstract class AbstractEvent implements Event{

	@Override
	public Class<? extends Event> getType() {
		return getClass();
	}
}
