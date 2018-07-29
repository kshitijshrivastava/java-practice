package famousInterviewQuestions;

public class SwapTwoInteger {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		
		//1. Without using temp and using + operator
		/*num1 = num1+num2; //300
		num2 = num1-num2; //300-200 = 100
		num1 = num1-num2; //300-10 = 200
		
		System.out.println(num1);
		System.out.println(num2);*/
		
		//2. Without using temp and using * operator
		
		/*num1 = num1*num2; //20000
		num2 = num1/num2; //20000/200 = 100
		num1 = num1/num2; //20000/100 = 200
		System.out.println(num1);
		System.out.println(num2);*/
		
		//3. Without using temp and using XOR operator
		
		/*num1 = num1^num2;
		num2 = num1^num2;
		num1 = num1^num2;
		System.out.println(num1);
		System.out.println(num2);*/
		
		//4. With using temp 
		
		int temp = num1;
		num1=num2;
		num2=temp;
		System.out.println(num1);
		System.out.println(num2);
		
		
		
	}

}
