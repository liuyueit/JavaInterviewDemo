package com.interview.javabasic.thread;

import java.util.concurrent.*;

public class ThreadPoolDemo {
	public static void main(String[] args) {
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool ( );
		Future<String> future =  newCachedThreadPool.submit (  new MyCallable ( ) );
		//newCachedThreadPool.execute (  new MyRunnable () );
		if(!future.isDone ()){
			System.out.println ( "task has not finished ,please wait!"  );
		}
		try {
			System.out.println (future.get ());
		} catch (InterruptedException e) {
			e.printStackTrace ( );
		} catch (ExecutionException e) {
			e.printStackTrace ( );
		}finally {
			(( ExecutorService ) newCachedThreadPool).shutdown ();
		}
	}
}
