package org.java.design;

public class ReflectServiceImpl {

	public String sayHello(String name) {
		System.out.println("Hello " + name);
		return "hello1";
	}

	public static ReflectServiceImpl getInstance() {
		ReflectServiceImpl object = null;
		try {
			object = (ReflectServiceImpl) Class.forName("org.java.design.ReflectServiceImpl").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return object;
	}

	public static void main(String[] args) {
		ReflectServiceImpl reflectServiceImpl = ReflectServiceImpl.getInstance();
		reflectServiceImpl.sayHello("leo");

	}
}
