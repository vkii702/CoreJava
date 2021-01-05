package com.vicky.collectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new ArrayList<Integer>();//List is a interface it is not a part of collection.
		Integer i=new Integer(101);
		Integer i1=new Integer(102);
		Integer i2=new Integer(103);
		Integer i3=new Integer(101);
		list.add(i);
		list.add(i1);
		list.add(i2);
		list.add(i3);
		ListIterator<Integer> iterator=list.listIterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

}
