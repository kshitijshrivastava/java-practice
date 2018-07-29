package famousInterviewQuestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		//@SuppressWarnings("resource")
		System.out.println("Please enter the string to be reversed");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		String output = "";  //should not be initialized to null but to blank
		int length = input.length();
		//System.out.println(lenght);
		
		for(int i=length-1; i>=0; i--) // loop should be from length-1
		{
			output = output+input.charAt(i);
			//System.out.println(output);
		}
		
		System.out.println("The reverse of "+input+ " is-----> "+output);
		if(output.equals(input))
		{
			System.out.println("This a palindrome string");
		}
		else
		{
			System.out.println("Not a palindrome string");
		}
		
		//2. Using String Buffer
		
		StringBuffer sb = new StringBuffer(input);
		System.out.println("Reverse of "+input+ " using String buffer is----> " + sb.reverse());

	}

}
