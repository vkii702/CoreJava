package com.vicky.collectionDemo;

import java.util.ArrayDeque;
import java.util.Iterator;

public class arrayDequedemo {
	public static void main(String[]args)
	{
		ArrayDeque<Integer>demo=new ArrayDeque<Integer>();
		Integer i=new Integer(101);
		Integer i1=new Integer(102);
		Integer i2=new Integer(103);
		Integer i3=new Integer(104);
		Integer i4=new Integer(105);
			demo.add(i);
			demo.add(i1);
			demo.add(i2);
			//	System.out.println(demo);
			demo.addFirst(i3);//add first meathod is used to add element at first position. 
			//	System.out.println(demo);
			demo.addLast(i4);
				System.out.println(demo);
				
	}

}
