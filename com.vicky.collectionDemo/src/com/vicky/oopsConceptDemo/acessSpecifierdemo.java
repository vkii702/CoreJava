package com.vicky.oopsConceptDemo;

public class acessSpecifierdemo {
	static int a=4;
	public void add()
	{
		System.out.println("The number "+a);
		a++;
		System.out.println("The number "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		acessSpecifierdemo demo=new acessSpecifierdemo();
		demo.add();//Accessing variable using reference. 

	}

}
