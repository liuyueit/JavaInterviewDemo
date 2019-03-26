package com.interview.javabasic.relect;

import java.lang.reflect.Method;

/*
public class ReflectSample {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchMethodException {
		Class rc = Class.forName( "com.interview.javabasic.relect.Robot" );
		Robot r = ( Robot ) rc.newInstance( );
		System.out.println( "Class name is " + rc.getName( ) );
		Method getHello = rc.getDeclaredMethod( "throwHello" , String.class );
		getHello.setAccessible( true );
		Object str = getHello.invoke( r , "Bob" );
		System.out.println( "getHello result is " + str );
		Method sayHi = rc.getMethod( "sayHi" , String.class );
		sayHi.invoke( r , "Welcome" );
		System.out.print( System.getProperty( "java.ext.dirs" ) );

	}
}
*/
