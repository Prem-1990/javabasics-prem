package com.atipune.java.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		
	       List l=new LinkedList();
	       
	     
			ll.add(10);	ll.add(2);  ll.add(4); ll.add(8);
			ll.add(30);  ll.add(2);  //ll.add(null);
			
			System.out.println(ll);
			ll.addFirst(2.2);
			ll.addLast(7.2);
			
			ll.add(7, 4);
			ll.remove(7);
			System.out.println(ll);
			
			System.out.println("get first :"+ll.getFirst());
			System.out.println("get last: "+ll.getLast());
			
			System.out.println("remove first :"+ll.removeFirst());
			System.out.println("remove last: "+ll.removeLast());
			
			System.out.println(ll);
			ll.remove(3);
			System.out.println(ll);
			
		}

	


}
