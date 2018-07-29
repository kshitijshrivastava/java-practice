package objectsClassConcept;

public class ObjectMethodsDemo1 {
	
	public void m1()
	{
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		ObjectMethodsDemo1 obj = new ObjectMethodsDemo1();
		//Object obj2=obj1;
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj.toString());
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj.hashCode());
		
		System.out.println(obj1.equals(obj2));

	}

}
