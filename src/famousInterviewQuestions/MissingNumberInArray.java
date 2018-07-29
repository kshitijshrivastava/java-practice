package famousInterviewQuestions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		//int[] a = {1,2,3,4,6,7,8,9}; // 5 is missing
		
		int a[] = {22,23,25,26,27,28,29,30};
		
		//find sum of array elements
		
		int sum=0;
		for(int i=0;i<a.length; i++)
		{
			sum = sum+a[i];
		}
		System.out.println("sum of array is "+sum);
		
		//find the sum of sequence from 1 to 9
		
		int sumOfSequence = 0;
		for(int j=22;j<=30;j++)
		{
			sumOfSequence = sumOfSequence+j;
		}
		System.out.println("sum of sequence is "+sumOfSequence);
		
		int missingNumber = sumOfSequence-sum;
		
		System.out.println("missing number in sequence is "+missingNumber);


	}

}
