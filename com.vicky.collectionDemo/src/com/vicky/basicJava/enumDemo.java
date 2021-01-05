package com.vicky.basicJava;
enum Fruit{orange,apple,chickoo,banana};//enum helps us to print the list of values according our choice.
public class enumDemo {
	public static void main(String[]args)
	{
	for(Fruit frut:Fruit.values())//values meathod is used to access the element from the list.
	{
		System.out.println("I like fruit" + frut);
	}
	}

}
