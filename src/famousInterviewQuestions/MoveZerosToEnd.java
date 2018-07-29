package famousInterviewQuestions;

public class MoveZerosToEnd {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
 
	static void moveAll0sToEndOfArray(int[] arr) {
		int x = 0;
		int i = -1;
		int j;
		for(j=i+1;j<arr.length;j++) //0
		{
			if(arr[j] != x) // 1 != 0
			{
				i++; // 0
				swap(arr,i,j); // 0,0
			}
		}
	}
 
	static void printArray(int[] arr) 
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
 
	public static void main(String[] args) 
	{
		int[] arr = {1, 9, 8, 4, 2, 0, 0, 7, 0, 6, 0, 9};
 
		printArray(arr);
 
		moveAll0sToEndOfArray(arr);
 
		printArray(arr);
	}

}
