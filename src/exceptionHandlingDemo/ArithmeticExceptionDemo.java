package exceptionHandlingDemo;

import java.nio.charset.MalformedInputException;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		int x = 10;
		int y =0;
		int a[]= new int[5];
		
		try
		{
			System.out.println("Entering try block");
			//a[8]=50;
			System.out.println(x/y);
			//a[5]=50;
			System.out.println("Exiting try block");
		}
		
		catch (Exception e)
		{
			System.out.println("Entering Arithmetic catch block");
			System.out.println(e.getMessage());
			System.out.println("Exiting Arithmetic catch block");
		}
		try
		{
			System.out.println("Entering try block");
			a[8]=50;
			//System.out.println(x/y);
			//a[5]=50;
			System.out.println("Exiting try block");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Entering ArrayIndex catch block");
			System.out.println(e.getMessage());
			System.out.println("Exiting ArrayIndex catch block");
		}
		catch (Exception e)
		{
			System.out.println("Entering generalised catch block");
			System.out.println(e.getMessage());
			System.out.println("Exiting generalised catch block");
		}
		
		System.out.println("x ="+x);
		System.out.println("y ="+y);
		//System.out.println();

	}

}
