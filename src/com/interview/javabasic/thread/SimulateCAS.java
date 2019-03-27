package com.interview.javabasic.thread;

public class SimulateCAS {
	private int value;

	public synchronized  int getValue(){
		return value;
	}

	public boolean compareAndSet(int expect, int newValue) {
		synchronized (this){
			if(value == expect){
				value = newValue;
				return true;
			}
		}
		return false;
	}
}
