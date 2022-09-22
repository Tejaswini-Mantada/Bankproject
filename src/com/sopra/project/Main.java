package com.sopra.project;

public class Main 
{
	static double accBal=0;
	public static double deposit(double amt) 
	{
		accBal=accBal+amt;
		return accBal;
	}
	public static double withdraw(double amt) 
	{
	    accBal=accBal-amt;
		return accBal;
	}
	public static double display() 
	{
		return accBal;
	}

	public static void main(String[] args) {
		Bank user=new Bank();
		String AccNumber=user.getAccNumber();
		System.out.println("After depositing to the account number:"+AccNumber+deposit(500));
		System.out.println("After withdrawing from the account number:"+AccNumber+withdraw(270));
		System.out.println("The remaining balance is:"+display());
	}

}
