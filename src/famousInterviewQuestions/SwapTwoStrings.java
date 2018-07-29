package famousInterviewQuestions;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String str1 = "Hello"; //5
		String str2 ="Universe"; //8
		System.out.println("Before swapping");
		System.out.println("Value of str1 "+str1);
		System.out.println("Value of str2 "+str2);
		str1=str1.concat(str2); //13 HelloUniverse
		
		
		str2=str1.substring(0, str1.length()-str2.length()); // substring(0,5) //Hello //8
		str1=str1.substring(str2.length());
		
		System.out.println("After swapping");
		System.out.println("Value of str1 "+str1);
		System.out.println("Value of str2 "+str2);
		

	}

}
