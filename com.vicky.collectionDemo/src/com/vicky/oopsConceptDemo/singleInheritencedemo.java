package com.vicky.oopsConceptDemo;
class Books 
{
	int page_num;
	String authorname,name;
	float price;
	
	public Books()
	{
		page_num=50;
		authorname="vicky sawnt";
		name="The living Ideas";
		price=15.3f;
	}
	public void display()
	{
		System.out.println("The name of the book is"+name);
		System.out.println("the Author  of the book"+authorname);
		System.out.println("The price of the book"+price);
		System.out.println("The page number of the book "+page_num);
	}
	
	
}


public class singleInheritencedemo extends Books {
	int shippingcharge=10;
		
	public void printInfo()
	{
		display();//calling the function.
		System.out.println("The shipping charges"+shippingcharge);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleInheritencedemo demo=new singleInheritencedemo();
		demo.printInfo();

	}

}
