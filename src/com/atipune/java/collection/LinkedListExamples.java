package com.atipune.java.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

	public static void main(String[] args) {
	LinkedList<Integer> ll = new LinkedList<Integer>();
	List l=new LinkedList();
	
	ll.add(10);ll.add(1);ll.add(78);ll.add(90);ll.add(98);
	
	System.out.println(ll);
	
	ll.addFirst(67);
	ll.addLast(96);
	System.out.println(ll);
	ll.add(4,8);
	ll.remove(5);
	
	System.out.println(ll);
	System.out.println("get first:"+ll.getFirst());
	System.out.println("get last:"+ll.getLast());
	


System.out.println("remove first"+ll.removeFirst());
System.out.println("remove last"+ll.removeLast());
System.out.println(ll);


	}

}
