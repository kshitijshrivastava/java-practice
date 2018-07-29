package AmazonInterview;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfCharacterInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the input string");
		String input = sc.next();
		int length = input.length();
		char array[] = new char[length];
		
		for(int i=0;i<length;i++)
		
		{
			array[i] = input.charAt(i);
		}
		
		//Arrays.sort(array);
		//System.out.println(array);
		
		
		System.out.println("Enter the character you want to search for occurence");
		char search = sc.next().charAt(0);
		int count = 0;
		
		for(int i=0;i<array.length;i++)
		{
			
				if(array[i]==search)
				{
					count++;
				}
		}
		
		System.out.println("Number of occurence of "+"{ "+search+" }" +"in "+input+ " is "+ count);
		

	}

}
