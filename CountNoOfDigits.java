package com.ferry.codingpractice.basic;

public class CountNoOfDigits {

	public static void main(String[] args) {

			int no = 1234;
			int num = no;
			int count = 0;
			
			// for zero
			if(num == 0)
			{
				count++;
			}
			
			// Negative no
			if(num < 0)
			{
				num = num * -1;
			}
			
			// main logic 
			while(num!=0)
			{
				num = num / 10;
				count++;
			}
			
			System.out.println("No of Digits are :" + count);
	}

}
