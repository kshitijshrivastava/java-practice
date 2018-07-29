package typeCastingDemo;

class Test2 {
	
	Test2() {
		this(4);
		System.out.println("Running no arg const");
	}
	
	Test2(int arg)
	{
		this(54.34);
		System.out.println("Running INT const");
	}
	
	Test2(double arg)
	{
		System.out.println("Running DOUBLE const");
	}
	

}
public class ConstructorChainingDemo{	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		
		

	}

}
