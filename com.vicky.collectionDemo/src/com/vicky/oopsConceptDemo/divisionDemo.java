package com.vicky.oopsConceptDemo;

import java.util.Scanner;

public class divisionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		int num1,num2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num1=sc.nextInt();
		System.out.println("enter a number");
		num2=sc.nextInt();
		result=num1/num2;
		System.out.println("the result is"+result);
		}
	catch(Exception e)
	{
		System.out.println("denominator cannot be zero");
	}
}
}
