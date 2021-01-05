package com.vicky.collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>obj=new HashMap<Integer,String>();
		Integer i1=new Integer(101);
		Integer i2=new Integer(102);
		Integer i3=new Integer(103);
			obj.put(i1, "vicky");//put meathod is used to add data in the obj.
			obj.put(i2,"sanket");
			obj.put(i3, "adil");
				for(Map.Entry<Integer,String> data:obj.entrySet())//we are creating the object of the map.entry
				{//and we are adding the value by using entryset meathod.
					System.out.println(data);
				}
		
	}

}
