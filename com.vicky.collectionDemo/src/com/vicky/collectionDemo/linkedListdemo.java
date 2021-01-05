package com.vicky.collectionDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class linkedListdemo {
	public static void main(String []args) 
	{
			List<Integer>list=new LinkedList<Integer>();//we are inheriting the Linkedlist from a list interface.
			Integer i=new Integer(101);//Integer is a wrapper class which object is created to add the value to it.
			Integer i1=new Integer(102);
			Integer i2=new Integer(108);
			Integer i4=new Integer(103);//In linked list the null value is not allowed.
			Integer i5=new Integer(101);//In linked List duplicate value is allowed.
				list.add(i);//adding the value to the list
				list.add(i1);
				list.add(i2);
				list.add(i4);
				list.add(i5);
					ListIterator<Integer>iterator=list.listIterator();//List iterator is use to iterate the value which is added to the list.
						while(iterator.hasNext())//while loop iteratee the value till the value exist.
						{
							System.out.println(iterator.next());
						}
	}

}
