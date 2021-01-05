package com.vicky.oopsConceptDemo;

public class Account {
	////This meathod is used to deposite the money in account
	public void Deposite(int amount,String name,long accno)
	{
		int amt=amount;
		String usrname=name;
		long accountno=accno;
		System.out.println("The amount deposite"+amt+"to username"+usrname+"on accountno"+accountno);
		
	}
	////The meathod is for withdrawing money.
	public void Withdraw(int amount,String name,long accno)
	{
		int drawamount=amount;
		String draweeusrname=name;
		long draweeaccno=accno;
		
		System.out.println("The amount is withdraw"+drawamount+"from user "+draweeusrname+"on account no"+draweeaccno);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account();
		acc.Deposite(2000,"vicky",1010020201);
		acc.Withdraw(1000,"sanket",1281820182);
	}

}
