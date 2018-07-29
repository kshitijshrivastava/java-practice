package typeCastingDemo;

public class Parent 
{
	int x = (int) 10.99;
	double y = (double) 91;
	
	public static void main(String[] args) 
	{
	    Parent p = new Parent();
		System.out.println("Value of x = " +p.x);
		System.out.println("Value of y = " +p.y);
	}
	
}