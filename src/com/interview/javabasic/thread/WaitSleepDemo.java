package com.interview.javabasic.thread;

public class WaitSleepDemo {
	public static void main(String[] args) {
		final Object lock = new Object ();
		 new Thread ( new Runnable ( ) {
			@Override
			public void run() {
				System.out.println ( "thread A is waiting to get lock" );
				synchronized (lock) {
					try {
						System.out.println ( "thread A get lock" );
						Thread.sleep ( 20 );
						System.out.println ( "thread A do wait method" );
						lock.wait ( );
						System.out.println ( "thread A is done" );
					} catch ( InterruptedException e){
						e.printStackTrace (  );
					}
				}
			}
		} ).start();
		 try{
		 	Thread.sleep ( 10 );
		 }catch (InterruptedException e){
		 	e.printStackTrace (  );
		 }
		new Thread ( new Runnable ( ) {
			@Override
			public void run() {
				System.out.println ( "thread Bis waiting to get lock" );
				synchronized (lock) {
					try {
						System.out.println ( "thread B  get lock" );
						System.out.println ( "thread B  is sleeping 10 ms" );
						Thread.sleep ( 10 );
						System.out.println ( "thread B is done" );
						//lock.notify ();
						lock.notifyAll ();
					} catch ( InterruptedException e){
						e.printStackTrace (  );
					}
				}
			}
		} ).start();
	}
}
