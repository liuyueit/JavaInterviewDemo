package com.interview.javabasic.autoboxing;

import java.util.Objects;

public class AutoboxingTest {
		public static void main(String[] args) {

			Integer a = 1; // Integer  a= new Interger(1) 1-> heap a ->stack
			Integer b = 2;
			Integer c = 3; //-128 --127 cache, don'' need to new '3' 3-> stack c ->statck
			Integer d = 3;
			Integer e = 321;
			Integer f = 321;  // new another var 321, can't use 321.
			Long g = 3L;
			Long h = 2L;

			System.out.println(c==d);
			System.out.println(e==f);
			System.out.println(c==(a+b));
			System.out.println( Objects.equals ( c , a + b ) );
			System.out.println(g==(a+b));
			System.out.println(g.equals(a+b));
			System.out.println(g.equals(a+h));
		}

}
