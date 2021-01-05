package com.vicky.collectionDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class treeSetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>demo=new TreeSet<String>();//Set interface in which the HashSet is a class
		String s1=new String("One");
		String s2=new String("Two");
		String s3=new String("Three");
		demo.add(s1);
		demo.add(s2);
		demo.add(s3);
		Iterator<String>iterator=demo.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}

	}

}