package com.vicky.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSetdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>hashSet=new HashSet<Integer>();//Set interface in which the HashSet is a class.
		Integer i=new Integer(102);//Integer is a wrapper class which is used to wrap  the data of type Integer.
		Integer i1=new Integer(103);
		Integer i2=new Integer(104);
		hashSet.add(i);
		hashSet.add(i1);
		hashSet.add(i2);
		Iterator<Integer> iterator=hashSet.iterator();//we are creating the object of the Iterator 
		while(iterator.hasNext())											// and initialized the data to the object.
		{
			System.out.println(iterator.next());//It is used to print the value till 
		}
		
		

	}

}
