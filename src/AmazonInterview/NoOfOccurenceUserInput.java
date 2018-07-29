package AmazonInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class NoOfOccurenceUserInput {

	public static void main(String[] args) {
		System.out.println("Please enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Please enter contents of array");
		for(int i=0;i<size;i++)
		{
			System.out.println("Please enter "+ (i+1)+ " element of the array");
			array[i]=sc.nextInt();
			
		}
		System.out.println("The contents of array are : ");
		for(int i=0;i<size;i++)
		{
			
			
			System.out.println(array[i]);
						
		}
		
		
		Map<Integer,Integer> data = new HashMap<Integer,Integer>();
		
		for(Integer num:array)
		{
			Integer count = data.get(num);
			if(count==null)
			{
				data.put(num, 1);
			}
			else
			{
				data.put(num, ++count);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry :data.entrySet())
		{
			System.out.println("Element "+entry.getKey()+ " occured "+ entry.getValue()+ " times");
		}

	}

}
