package SiemensInterview;

public class ArrayError {

	public static void main(String[] args) {
    
		int arr[] = new int[4];
		arr[1] = 5;
		arr[2] = 6;
		arr[3] = 7;
		
		/*for(int data:arr)
		{
			System.out.println(data+" ");
		}*/
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}


	}

}
