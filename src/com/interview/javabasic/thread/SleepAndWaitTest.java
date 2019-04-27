package com.interview.javabasic.thread;

/**
 * The difference of sleep and wait .
 */
public class SleepAndWaitTest  implements Runnable{
	int number = 10;

	public void  firstMethod() throws Exception{
		synchronized (this) {
			number += 100;
			System.out.println ( number );
		}
	}

	public void secondMethod() throws Exception{
		synchronized (this){
			/**
			 * sleep 2s,block the thread .
			 */
			Thread.sleep ( 2000 );
			//this.wait(2000);
			number *= 200;
		}
	}
	@Override
	public void run( ) {
		try{
			firstMethod ();
		}catch(Exception e){
			e.printStackTrace ();
		}
	}

	public static void main(String[] args) throws Exception{
		SleepAndWaitTest  sawTest = new SleepAndWaitTest ();
		Thread thread = new Thread(sawTest);
		thread.start ();
		sawTest.secondMethod( );
	}
}
