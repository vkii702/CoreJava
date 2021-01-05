package com.vicky.collectionDemo;

import java.util.Map;
import java.util.TreeMap;

public class treeMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer>obj=new TreeMap();//Map store the value in a key and value format(k,V) 
		String s1=new String("vicky");
		String s2=new String("sanket");
		String s3=new String("Adil");
			obj.put(s1, 101);//treemap is use when we want a data in a sorted order.
			obj.put(s2, 102);//It does not allow key as its null value. 
			obj.put(s3, null);//It allows value as null value.
			//obj.put(null, 103);
				for(Map.Entry<String, Integer> data:obj.entrySet())
				{
					System.out.println(data);
				}
	}

}
