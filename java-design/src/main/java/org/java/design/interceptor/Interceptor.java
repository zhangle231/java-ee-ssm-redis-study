package org.java.design.interceptor;

import java.lang.reflect.Method;

public interface Interceptor {

	/*
	 * before 
	 * 	true --> real object
	 *  false --> around
	 * after
	 */
	public boolean before(Object proxy, Object target, Method method, Object[] args);

	public void around(Object proxy, Object target, Method method, Object[] args);

	public void after(Object proxy, Object target, Method method, Object[] args);
}
