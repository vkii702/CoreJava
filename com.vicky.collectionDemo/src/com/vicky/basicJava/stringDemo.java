package com.vicky.basicJava;

public class stringDemo {
	public static void main(String [] args)
	{
		String s1=new String ("hello baby");
		char[] str2= new char[6];
		String s2=new String("hello baby");
		//System.out.println(s1+"hello"+s2);
		//System.out.println("length of the string"+s2.length());
		//System.out.println("Character at" + s2.charAt(0));
		//s1.getChars(6,10, str2,0);//(start,ends,destination,destination begin)
		//System.out.println();
		//System.out.println(str2);
		System.out.println(s1.equals(s2));
		
	}

}
