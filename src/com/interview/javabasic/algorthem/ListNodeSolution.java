/*package com.interview.javabasic.algorthem;

public class ListNodeSolution {

	public LiseNode reverseList (ListNode head ){

		if (head == null ) return null ;


			ListNode pre = null ;
			ListNode next = head.next;

		while (head != null ){

			head.next = pre ;

			pre = head ;
			head = next ;
			if (head != null )
				next = head.next;
		}
		return  pre ;
	}


}
*/
