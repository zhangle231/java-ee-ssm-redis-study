package org.java.design.interceptor;

public class HelloWorldImpl implements HelloWorld{

	@Override
	public String sayHelloWorld() {
		System.err.println("hello world.");
		return "hello";
	}
}
