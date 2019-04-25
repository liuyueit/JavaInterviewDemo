/*package com.interview.javabasic.jvm.gc;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class ReferenceQueueTest {
	private static ReferenceQueue<NormalObject> rq = new ReferenceQueue <NormalObject> ();

	private static void checkQueue(){
		Reference<NormalObject> ref = null ;
		while ((ref = (Reference<NormalObject>)rq.poll ()) != null){
			if (ref != null){
				System.out.println ("In queue:" +((NormalObjectWeakReference)(ref)).name );
				System.out.println ("reference object:" +ref.get () );
			}
		}
	}

	public static void main(String[] args) {
		ArrayList

	}
}
*/