package typeCastingDemo;

import java.util.Scanner;

public class AddTwoNum {

	

	public static void main(String[] args) 
	
	{
		
		//int num1=0;
		//int num2=0;
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd Number:");
		num2 = sc.nextInt();
		
		System.out.println("Enter 3rd Number:");
		num3 = sc.nextInt();
		int big = addNumber(num1,num2,num3);
		//System.out.println("The sum of "+ num1 +" and " + num2 +" is " + sum);
		System.out.println("The biggest number is"+ big);
		

	}
	
	public static int addNumber(int num1, int num2,int num3)
	{
		
		//int sum = num1 + num2;
		//return sum;
		int big;
		if (num1>num2)
			big = num1;
		else big = num2;
		if (num3>big)
			big = num3;
		
		return big;

		
	}

}
