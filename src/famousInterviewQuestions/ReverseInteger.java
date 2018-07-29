package famousInterviewQuestions;

public class ReverseInteger {

	public static void main(String[] args) {
		int originalNumber= 10153;
		int number = originalNumber;
		int reverse = 0;
		/*int test = 1%10;
		System.out.println("test " + test);*/
		
		while(number!=0)
		{
			reverse = reverse*10 + number%10; // 0+3 //30+5//350+1//3510+0//35100+1
			number= number/10;//1015//101//10//1
			
		}
		System.out.println("reverse of "+originalNumber+ " is "+ reverse);
		
		
		//2. second way is using StringBuffer
		
		StringBuffer sb = new StringBuffer(String.valueOf(originalNumber)).reverse();
		System.out.println("reverse of "+originalNumber+ " using StringBuffer is "+ sb);
		
	}

}
