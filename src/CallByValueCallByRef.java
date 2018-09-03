
public class CallByValueCallByRef {
	
	int a;
	int b;

	public static void main(String[] args) {
		
		
		CallByValueCallByRef obj = new CallByValueCallByRef();
		int c=5;
		int d=10;
		int sum = obj.sum(c,d);
		System.out.println(sum);
		obj.a = 10;
		obj.b = 20;
		System.out.println("before calling swap fn");
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.swap(obj);
		System.out.println("after calling swap fn");
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		

	}
	
	
	public int tripleCounter(String str) {
		  int length = str.length();
		  int counter = 0;
		  
		  for (int i = 0; i < length-2; i++){
		    char tmp = str.charAt(i);
		    if (tmp == str.charAt(i+1) && tmp == str.charAt(i+2))
		      counter++;
		  }
		  return counter;
		}
	
	public int sum(int x, int y)
	{
		x=10;
		y=20;
		int total = x+y;
		return total;
	}
	
	public void swap(CallByValueCallByRef t)
	{
		int temp;
		temp = t.a;
		t.a = t.b;
		t.b= temp;
		
	}

}
