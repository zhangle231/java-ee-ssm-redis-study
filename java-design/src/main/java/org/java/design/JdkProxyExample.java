package org.java.design;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class JdkProxyExample implements InvocationHandler {

	private Object target = null;

	public Object bind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("enter logic method.");
		Object obj = method.invoke(target, args);
		System.out.println("after logic method.");
		return obj;
	}

	public static void main(String[] args) {
		JdkProxyExample jdk = new JdkProxyExample();
		List li = (List) jdk.bind(new ArrayList<>());
		li.add("123");
	}
}
