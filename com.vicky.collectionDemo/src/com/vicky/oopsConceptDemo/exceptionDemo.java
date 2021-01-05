package com.vicky.oopsConceptDemo;

import java.util.Scanner;

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		int num1,num2,result;
		String snum1,snum2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		snum1=sc.next();
		System.out.println("enter a number");
		snum2=sc.next();
		num1=Integer.parseInt(snum1);
		num2=Integer.parseInt(snum2);
		result=num1+num2;
		System.out.println("The result:"+result);
	}
	catch(Exception e) {
		System.out.println("please input numeric value");
		
	}
	}

}
