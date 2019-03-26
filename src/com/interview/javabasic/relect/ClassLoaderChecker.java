package com.interview.javabasic.relect;

public class ClassLoaderChecker {
	public static void main(String [] args ) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		MyClassLoader m = new MyClassLoader("/Users/Yoko/desktop/","myClassLoader");
		Class c = m.loadClass("Wali");
		System.out.println(c.getClassLoader());
		c.newInstance();
	}
}
