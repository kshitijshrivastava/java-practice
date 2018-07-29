package famousInterviewQuestions;

import java.util.Arrays;

public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		int a[] ={1,0,3,-1};
		int largest = a[0];
		int smallest = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			else if (a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		
		System.out.println("The array is "+Arrays.toString(a));
		System.out.println("Largest number is "+largest);
		System.out.println("Smallest number is "+smallest);
		

	}

}
