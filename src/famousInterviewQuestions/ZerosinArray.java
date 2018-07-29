package famousInterviewQuestions;

public class ZerosinArray {

	public static void main(String[] args) {

		int a[]= {1,0,4,0,11,0,3,9,8};// 1,8,4,9,11,3,0,0,0
		int length = a.length;
		int tempLength = length;
		int temp;
		for(int i=0; i<length; i--)
			
				{
					if (a[i] == 0)
					{
						temp=a[length-1]; //8
						a[length-1]= a[i];// 0
						a[i]=temp;//8
						//tempLength--;


					}
				
			}

		System.out.println("*****");


		for(int j=0; j<length; j++)
		{
			System.out.println(a[j]);
		}
		
		

	}

}
