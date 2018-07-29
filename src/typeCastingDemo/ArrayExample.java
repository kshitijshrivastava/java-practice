package typeCastingDemo;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) 
	{
		
		int[] arr = readArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to be searched");
		int element = sc.nextInt();
		printEvenArray(arr,element);
		
		String s = "Hello";
		char[] ch = s.toCharArray();
		for (int i=0; i<ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		
	}
		
		
		public  static int[] readArray()
		{
			System.out.println("Please enter the lenght of Array");
			
			Scanner sc = new Scanner(System.in);
			int length = sc.nextInt();
			int[] newArray = new int[length];
			System.out.println("Enter the values of array");
			for (int i=0;i<length;i++)
			{
				newArray[i]= sc.nextInt();
				
			}
			return newArray;
		}
		
		public static void printEvenArray(int[] oldArray,int element)
		{
			int length = oldArray.length;
			//System.out.println("Printing the even contents of Array");
			int count = 0;
			for (int i=0;i<length;i++)
			{
				if (oldArray[i]==element)
				{
				System.out.println("Element found at location"+(i+1));
				count++;
				}
				
			}
			if (count==0)
			{System.out.println("Element not found");}
			//System.out.println("Count of even elements in Array ="+count);
		}
	

}
