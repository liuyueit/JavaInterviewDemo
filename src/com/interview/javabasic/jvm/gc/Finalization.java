package com.interview.javabasic.jvm.gc;

import java.lang.ref.ReferenceQueue;

public class Finalization {
	public static Finalization finalization;
	@Override
	protected  void finalize( ){
		System.out.println ("Finalized" );
		finalization = this;
	}

	public static void main(String[] args) {
		Finalization f = new Finalization ( );
		System.out.println ("First print" + f );
		f = null;
		System.gc ();
		try{
			Thread.currentThread ().sleep ( 1000 );
		}catch(InterruptedException e){
			e.printStackTrace (  );
		}
		System.out.println ("Second print"+f );
		System.out.println (f.finalization );
	}
}
