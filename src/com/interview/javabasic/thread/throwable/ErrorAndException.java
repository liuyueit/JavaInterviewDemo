package com.interview.javabasic.thread.throwable;

import java.io.FileNotFoundException;

public class ErrorAndException {
	private void throwErro(){
		throw new StackOverflowError ();
	}
	private void throwRuntimeException( ){
		throw new RuntimeException ();
	}
	private void throwCheckedException() throws FileNotFoundException{
			throw new FileNotFoundException ();
	}
	public static void main(String[] args) throws FileNotFoundException {
		ErrorAndException eae = new ErrorAndException ();
//		eae.throwErro ();
//		eae.throwRuntimeException ();
		eae.throwCheckedException();
	}

}
