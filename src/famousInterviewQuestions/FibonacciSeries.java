package famousInterviewQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
		 int n1 = 0;
		 int n2 = 1;
		 int total = 8;
		 int n3 =0;
		 // 1,1,2,3,5,8,13
		 System.out.println(n1);
		 System.out.println(n2);
		 
		 for (int i=2;i<total;i++)
		 {
			 n3= n2+n1; 
			 System.out.println(n3); 
			 n1=n2; 
			 n2=n3; 
			 
		 }

	}

}
