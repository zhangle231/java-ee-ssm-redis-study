package org.java.design;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectServiceImpl2 {

	private String name;

	public ReflectServiceImpl2(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.err.println("hello " + name);
	}

	public static ReflectServiceImpl2 getInstance() {
		ReflectServiceImpl2 object = null;

		try {
			object = (ReflectServiceImpl2) Class.forName("org.java.design.ReflectServiceImpl2")
					.getConstructor(String.class).newInstance("leo");
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return object;
	}

	public static void main(String[] args) {
		ReflectServiceImpl2.getInstance().sayHello();
		System.out.println("abc");

		ReflectServiceImpl target = new ReflectServiceImpl();

		try {
			Method method = ReflectServiceImpl.class.getMethod("sayHello", String.class);
			Object returnObj = method.invoke(target, "zhang san");
			System.out.println(returnObj);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
