package com.vicky.collectionDemo;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class vectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double>list=new Vector<Double>();
			Double d1=new Double(12.1);//vector cannot contained duplicate values.
			Double d2=new Double(13.1);
			Double d3=new Double(14.2);
			Double d4=new Double(12.1);
			Double d5=new Double(12.2);
				list.add(d1);
				list.add(d2);
				list.add(d3);
				list.add(d4);
				list.add(d5);
					ListIterator list1=list.listIterator();
						while(list1.hasNext())
						{
							System.out.println(list1.next());
						}
	}

}
