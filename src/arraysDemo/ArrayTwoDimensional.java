package arraysDemo;

import java.util.Scanner;

public class ArrayTwoDimensional {

	public static void main(String[] args) {
		
		int a[][] = new int[2][3];
		
		System.out.println("number of row "+ a.length);
		int row = a.length;
		System.out.println("number of column "+ a[0].length);
		int col = a[0].length;
		//System.out.println("just trying " +a[2].length);
		
		Scanner input = new Scanner(System.in);
		
		//entering values
		
	
		
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				System.out.println("Please enter the value "+i+" and "+j+ "for the 2D array");
				a[i][j] = input.nextInt();
			}
		}
		
		//displaying values
		
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		


	}

}
