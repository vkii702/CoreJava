package com.vicky.oopsConceptDemo;

abstract class Demo1
{
	abstract void add();//abstraction is a showing functionality hideing  of 
	void disp()			//abstract meathod doesnt have body.
	{					//when we declare abstract class then only we can declare abstract meathod.
		System.out.println("hello from display");
	}
}
public class abstractionDemo extends Demo1 {
	@Override
	void add()
	{
		
		System.out.println("hello from add");
	}
	private void sum()
	{
		System.out.println("Hello from sum ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	abstractionDemo demo=new abstractionDemo();//when we use new keyword it will automatically create 
	demo.add();								//a memory in the heap.
	demo.disp();
	demo.sum();
	}

}
