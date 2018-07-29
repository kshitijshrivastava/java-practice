package AmazonInterview;

import java.util.Scanner;

public class ValidArithmeticExpression {
	
	public static boolean isAnOperator(char c){
        return (c == '*' || c == '/' || c == '+' || c == '-' || c == '%');
    }
	
	private static boolean isValidExpression(String expression){
		
		if(isAnOperator(expression.charAt(0))||isAnOperator(expression.charAt(expression.length()-1)))
		
			return false;
		
		int unclosedParenthesis = 0;
		
		for(int i=0;i<expression.length();i++)
		{
			if(expression.charAt(i)=='(')
			{
				unclosedParenthesis++;
				if (i==expression.length()-1)
					return false;
			}
			

			if(expression.charAt(i)==')')
			{
				unclosedParenthesis--;
				if (i==0)
					return false;
			}
			if(isAnOperator(expression.charAt(i)))
			{
				if(isAnOperator(expression.charAt(i+1)) || expression.charAt(i-1)=='(' || expression.charAt(i+1)==')')
					return false;
			}
			
			
		}
		return (unclosedParenthesis == 0);
		
		
		
		
		
		//return (unclosedParenthesis == 0);
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("Enter the expression");
		Scanner sc= new Scanner(System.in);
		String expression = sc.next();
		
		boolean result = isValidExpression(expression);
		
		if (result==true)
		{
			System.out.println("Valid expression");
		
		}
		else
		{
			System.out.println("Invalid expression");
		}
		
			
			
		}

	

}
