package com.vicky.oopsConceptDemo;

class Subraction {///In program there will be only  one public class
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("the sum of the two number is"+c);
	}
}
class  polymorphisomDemo extends Subraction
{
	 void add(int c,int d )
	{
		int e=d-c;
		System.out.println("the subraction of two number is"+e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphisomDemo demo =new polymorphisomDemo();
		demo.add(1, 2);
		Subraction s1=new Subraction();
		s1.add(2, 3);
	}

}
