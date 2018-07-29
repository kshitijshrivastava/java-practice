package exceptionHandlingDemo;

public class CheckedExceptionDemo {
	
	public void print() throws InterruptedException 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			
			
					Thread.sleep(1000);
				
			
		}
	}

}
