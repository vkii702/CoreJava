package com.vicky.collectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class dataDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<studentDemo>obj=new ArrayList<studentDemo>();
		studentDemo s1=new studentDemo(101,"vicky","santacruz",120);
		studentDemo s2=new studentDemo(102,"sanket","vileparle",131);
		studentDemo s3=new studentDemo(103,"adil","jogeshwari",121);
			obj.add(s1);
			obj.add(s2);
			obj.add(s3);
				
				ListIterator<studentDemo> iterator=obj.listIterator();
				while(iterator.hasNext())
				{
					System.out.println(iterator.next());
				}

	}

}
