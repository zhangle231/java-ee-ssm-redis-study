package org.java.design.eda.fw;

public interface Handler <E extends Event>{
	void onEvent(E event);
}
