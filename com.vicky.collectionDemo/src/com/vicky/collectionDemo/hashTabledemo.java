package com.vicky.collectionDemo;

import java.util.Hashtable;
import java.util.Map;

public class hashTabledemo {
	public static void main(String []args)
	{
		Hashtable<Integer,String>obj=new Hashtable<Integer,String>();
		Integer i=new Integer(101);
		Integer i1=new Integer(102);
		Integer i2=new Integer(103);
			obj.put(i1,"vicky");
			obj.put(i2,"priya");
			obj.put(i2,"karan");
				for(Map.Entry<Integer,String> data:obj.entrySet())
				{
					System.out.println(data);
				}
	}

}
