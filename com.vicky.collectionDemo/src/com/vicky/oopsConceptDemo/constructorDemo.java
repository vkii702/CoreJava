package com.vicky.oopsConceptDemo;

public class constructorDemo {
	public void constructorDemo()//constructor doesnt return value
								//it cannot be inherited
	{
		System.out.println("Hello from constructor");
	}
	public void constructorDemo(int num1)
	{
		int num2=num1;
		System.out.println("The num"+num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructorDemo demo=new constructorDemo();
		demo.constructorDemo();
		demo.constructorDemo(5);
	}

}
