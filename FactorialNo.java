package com.ferry.codingpractice.basic;

public class FactorialNo {

	public static void main(String[] args) {

		int num = 5;
		int result = fact(num);
		System.out.println("Factorial of " + num + " is " + result);
		
	}
	
	public static int fact(int num)
	{
		//Base case
		if(num==0 || num==1)
			return 1;
		
		//Recursion
		return num * fact(num-1);
	}

}
