package com.ferry.codingpractice.basic;

public class ArmStrongNo {
	
	public static void main(String[] args) {
		
		// Never modify original no
		int no = 153;
		int num = no;
		int count = 0;
		
		// length calculate
		int tempNo = no;
		while(tempNo!=0)
		{
			tempNo = tempNo / 10;
			count++;
		}
		
		System.out.println("Size of No :" + count);
		
		// Logic of Armstrong
		int temp=0;
		int sum = 0;
		int lastDigit = 0;
		
		while(no!=0)
		{
			lastDigit = no % 10;
			temp = (int) Math.pow(lastDigit,count);
			sum = sum + temp;
			no = no / 10;
		}
		
		if(num==sum)
		{
			System.out.println(num + " is" + " Armstrong number");
		}
		
		else
		{
			System.out.println(num + " is" + " Not an Armstrong number");
		}
	}

}
